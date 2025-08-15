package com.fruitflvme.thousandsofcourses

import android.app.Application
import android.util.Log
import com.fruitflvme.data.network.dto.CoursesDto
import com.google.gson.Gson
import dagger.hilt.android.HiltAndroidApp
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import okhttp3.mockwebserver.Dispatcher
import okhttp3.mockwebserver.MockResponse
import okhttp3.mockwebserver.MockWebServer
import okhttp3.mockwebserver.RecordedRequest

@HiltAndroidApp
class App : Application() {

    private lateinit var mockWebServer: MockWebServer
    private lateinit var coursesJson: String
    private lateinit var coursesList: CoursesDto // Твой класс данных для курса

    override fun onCreate() {
        super.onCreate()

        // Считываем JSON один раз при старте
        coursesJson = assets.open("courses.json").bufferedReader().use { it.readText() }
        coursesList = Gson().fromJson(coursesJson, CoursesDto::class.java)

        CoroutineScope(Dispatchers.IO).launch {
            try {
                mockWebServer = MockWebServer()

                // Добавляем Dispatcher, который обрабатывает запросы
                mockWebServer.dispatcher = object : Dispatcher() {
                    override fun dispatch(request: RecordedRequest): MockResponse {
                        return when {
                            request.path == "/courses" -> {
                                MockResponse()
                                    .setResponseCode(200)
                                    .setBody(coursesJson)
                                    .addHeader("Content-Type", "application/json")
                            }

                            request.path?.startsWith("/courses/") == true -> {
                                val idStr = request.path?.substringAfterLast("/")
                                val id = idStr?.toIntOrNull()
                                if (id != null) {
                                    val course = coursesList.courses.find { it.id == id }
                                    if (course != null) {
                                        val courseJson = Gson().toJson(course)
                                        MockResponse()
                                            .setResponseCode(200)
                                            .setBody(courseJson)
                                            .addHeader("Content-Type", "application/json")
                                    } else {
                                        MockResponse().setResponseCode(404)
                                    }
                                } else {
                                    MockResponse().setResponseCode(400)
                                }
                            }

                            else -> MockResponse().setResponseCode(404)
                        }
                    }
                }

                mockWebServer.start(8080)

                Log.d("MockServer", "MockWebServer started on port ${mockWebServer.port}")

            } catch (e: Exception) {
                Log.e("MockServer", "Error starting MockWebServer: ${e.message}")
            }
        }
    }

    override fun onTerminate() {
        super.onTerminate()
        try {
            mockWebServer.shutdown()
            Log.d("MockServer", "MockWebServer is stopped")
        } catch (ignore: Exception) {
            Log.e("MockServer", "Error stopped MockWebServer: ${ignore.message}")
        }
    }
}

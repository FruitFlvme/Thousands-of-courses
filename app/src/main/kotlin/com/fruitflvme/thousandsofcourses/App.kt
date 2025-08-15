package com.fruitflvme.thousandsofcourses

import android.app.Application
import android.util.Log
import dagger.hilt.android.HiltAndroidApp
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import okhttp3.mockwebserver.MockResponse
import okhttp3.mockwebserver.MockWebServer


@HiltAndroidApp
class App : Application() {

    private lateinit var mockWebServer: MockWebServer

    override fun onCreate() {
        super.onCreate()

        CoroutineScope(Dispatchers.IO).launch {
            try {
                mockWebServer = MockWebServer()
                mockWebServer.start(8080)

                val json = assets.open("courses.json").bufferedReader().use { it.readText() }
                val mockResponse = MockResponse()
                    .setResponseCode(200)
                    .setBody(json)
                    .addHeader("Content-Type", "application/json")

                mockWebServer.enqueue(mockResponse)

                Log.d(
                    "MockServer",
                    "MockWebServer started and response enqueued on port ${mockWebServer.port}"
                )
            } catch (e: Exception) {
                Log.e("MockServer", "Error starting MockWebServer: ${e.message}")
            }
        }
    }

    override fun onTerminate() {
        super.onTerminate()
        try {
            mockWebServer.shutdown()
            Log.d(
                "MockServer",
                "MockWebServer is stopped"
            )
        } catch (ignore: Exception) {
            Log.e("MockServer", "Error stopped MockWebServer: ${ignore.message}")
        }
    }
}
package com.fruitflvme.data.network

import android.content.Context
import com.fruitflvme.data.network.dto.CoursesDto
import com.google.gson.Gson
import okhttp3.Interceptor
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.Protocol
import okhttp3.Request
import okhttp3.Response
import okhttp3.ResponseBody.Companion.toResponseBody

class MockInterceptor(private val context: Context) : Interceptor {

    private val gson = Gson()

    override fun intercept(chain: Interceptor.Chain): Response {
        val request = chain.request()
        val url = request.url.toString()

        if (url.endsWith("/courses")) {
            // Вернуть весь JSON с оборачивающим объектом
            val jsonString = context.assets.open("courses.json").use {
                it.reader().readText()
            }

            return createResponse(request, jsonString)
        }

        // Проверяем запрос по конкретному курсу /courses/{id}
        val courseIdRegex = Regex(".*/courses/(\\d+)")
        val matchResult = courseIdRegex.find(url)
        if (matchResult != null) {
            val requestedId = matchResult.groupValues[1].toIntOrNull()

            if (requestedId != null) {
                val jsonString = context.assets.open("courses.json").use {
                    it.reader().readText()
                }

                // Парсим в обёртку с полем courses
                val wrapper: CoursesDto = gson.fromJson(jsonString, CoursesDto::class.java)
                val courses = wrapper.courses

                val course = courses.find { it.id == requestedId }

                val responseJson = if (course != null) {
                    gson.toJson(course)
                } else {
                    "{}"
                }

                return createResponse(request, responseJson)
            }
        }

        return chain.proceed(request)
    }

    private fun createResponse(request: Request, json: String): Response {
        return Response.Builder()
            .code(200)
            .message(json)
            .request(request)
            .protocol(Protocol.HTTP_1_1)
            .body(json.toByteArray().toResponseBody("application/json".toMediaType()))
            .addHeader("content-type", "application/json")
            .build()
    }
}


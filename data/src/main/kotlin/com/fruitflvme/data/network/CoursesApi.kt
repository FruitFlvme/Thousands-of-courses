package com.fruitflvme.data.network

import com.fruitflvme.data.network.dto.CourseDto
import com.fruitflvme.data.network.dto.CoursesDto
import retrofit2.http.GET
import retrofit2.http.Path

interface CoursesApi {
    @GET("courses")
    suspend fun getCourses(): CoursesDto

    @GET("courses/{id}")
    suspend fun getCourseById(
        @Path("id") id: Int
    ): CourseDto
}
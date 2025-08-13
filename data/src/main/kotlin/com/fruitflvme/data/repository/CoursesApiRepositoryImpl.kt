package com.fruitflvme.data.repository

import com.fruitflvme.data.mapper.toDomain
import com.fruitflvme.data.network.CoursesApi
import com.fruitflvme.domain.model.Course
import com.fruitflvme.domain.repository.CoursesApiRepository

class CoursesApiRepositoryImpl(
    private val coursesApi: CoursesApi
) : CoursesApiRepository {
    override suspend fun getCourses(): List<Course> {
        return coursesApi.getCourses().courses.map { it.toDomain() }
    }

    override suspend fun getCourseById(id: Int): Course {
        return coursesApi.getCourseById(id).toDomain()
    }
}
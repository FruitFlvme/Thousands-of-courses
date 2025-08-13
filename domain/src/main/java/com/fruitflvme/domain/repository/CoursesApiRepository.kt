package com.fruitflvme.domain.repository

import com.fruitflvme.domain.model.Course

interface CoursesApiRepository {
    suspend fun getCourses(): List<Course>
    suspend fun getCourseById(id: Int): Course
}
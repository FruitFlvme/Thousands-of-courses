package com.fruitflvme.domain.repository

import com.fruitflvme.domain.model.Course
import kotlinx.coroutines.flow.Flow

interface CourseRepository {
    fun isCourseLiked(id: Int): Flow<Boolean>
    suspend fun likeCourse(course: Course)
    suspend fun unlikeCourse(course: Course)
    fun getCoursesLiked(): Flow<List<Course>>
}
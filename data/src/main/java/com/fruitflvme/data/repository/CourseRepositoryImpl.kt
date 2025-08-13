package com.fruitflvme.data.repository

import com.fruitflvme.data.database.dao.CourseDao
import com.fruitflvme.data.mapper.toDomain
import com.fruitflvme.data.mapper.toEntity
import com.fruitflvme.domain.model.Course
import com.fruitflvme.domain.repository.CourseRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class CourseRepositoryImpl @Inject constructor(
    private val courseDao: CourseDao,
) : CourseRepository {

    override fun isCourseLiked(id: Int): Flow<Boolean> =
        courseDao.getLikedCourseFlow(id).map { it != null }

    override suspend fun likeCourse(course: Course) {
        courseDao.likeCourse(course.toEntity())
    }

    override suspend fun unlikeCourse(course: Course) {
        courseDao.unlikeCourse(course.toEntity())
    }

    override fun getCoursesLiked(): Flow<List<Course>> =
        courseDao.getCoursesLikedFlow()
            .map { list -> list.map { it.toDomain() } }

}
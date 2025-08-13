package com.fruitflvme.domain.usecase

import com.fruitflvme.domain.model.Course
import com.fruitflvme.domain.repository.CourseRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetCoursesLikedUseCase @Inject constructor(
    private val repository: CourseRepository
) {
    operator fun invoke(): Flow<List<Course>> {
        return repository.getCoursesLiked()
    }
}

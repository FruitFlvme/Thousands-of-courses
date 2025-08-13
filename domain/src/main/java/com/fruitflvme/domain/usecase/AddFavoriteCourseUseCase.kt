package com.fruitflvme.domain.usecase

import com.fruitflvme.domain.model.Course
import com.fruitflvme.domain.repository.CourseRepository
import javax.inject.Inject

class AddFavoriteCourseUseCase @Inject constructor(
    private val repository: CourseRepository
) {
    suspend operator fun invoke(course: Course) {
        repository.likeCourse(course)
    }
}
package com.fruitflvme.domain.usecase

import com.fruitflvme.domain.model.Course
import com.fruitflvme.domain.repository.CourseRepository
import kotlinx.coroutines.flow.first
import javax.inject.Inject

class ToggleLikeCourseUseCase @Inject constructor(
    private val repository: CourseRepository
) {
    suspend operator fun invoke(course: Course) {
        repository.isCourseLiked(course.id).first().let { liked ->
            if (liked) {
                repository.unlikeCourse(course.copy(hasLike = false))
            } else {
                repository.likeCourse(course.copy(hasLike = true))
            }
        }
    }
}
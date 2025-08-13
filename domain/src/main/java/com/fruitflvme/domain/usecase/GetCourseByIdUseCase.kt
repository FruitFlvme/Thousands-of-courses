package com.fruitflvme.domain.usecase

import com.fruitflvme.domain.model.Course
import com.fruitflvme.domain.repository.CoursesApiRepository
import javax.inject.Inject

class GetCourseByIdUseCase @Inject constructor(
    private val repository: CoursesApiRepository
) {
    suspend operator fun invoke(id: Int): Course {
        return repository.getCourseById(id)
    }
}

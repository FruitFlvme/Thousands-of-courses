package com.fruitflvme.domain.usecase

import com.fruitflvme.domain.repository.CourseRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class IsCourseLikedUseCase @Inject constructor(
    private val repository: CourseRepository
) {
    operator fun invoke(id: Int): Flow<Boolean> =
        repository.isCourseLiked(id)
}
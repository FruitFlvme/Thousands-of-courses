package com.fruitflvme.feature_main.course

import android.util.Log
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.fruitflvme.domain.model.Course
import com.fruitflvme.domain.usecase.GetCourseByIdUseCase
import com.fruitflvme.domain.usecase.IsCourseLikedUseCase
import com.fruitflvme.domain.usecase.ToggleLikeCourseUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CourseDetailViewModel @Inject constructor(
    private val isCourseLikedUseCase: IsCourseLikedUseCase,
    private val toggleLikeCourseUseCase: ToggleLikeCourseUseCase,
    private val getCourseByIdUseCase: GetCourseByIdUseCase,
    savedStateHandle: SavedStateHandle
) : ViewModel() {
    private val courseId: Int = checkNotNull(savedStateHandle["courseId"])

    private val _course = MutableStateFlow<Course?>(null)
    val course: StateFlow<Course?> = _course.asStateFlow()

    private val _isFavorite = MutableStateFlow(false)
    val isFavorite: StateFlow<Boolean> = _isFavorite.asStateFlow()

    init {
        Log.d("CourseDetailViewModel", "Received courseId = $courseId")

        viewModelScope.launch {
            try {
                val course = getCourseByIdUseCase(courseId)
                _course.value = course
            } catch (e: Exception) {
                Log.e("CourseDetailViewModel", "Failed to load course", e)
                // Можно задать _course.value = null или показать ошибку
            }
        }

        viewModelScope.launch {
            isCourseLikedUseCase(courseId).collect { liked ->
                _isFavorite.value = liked
            }
        }
    }

    fun toggleLike() {
        val currentCourse = _course.value ?: return
        viewModelScope.launch {
            toggleLikeCourseUseCase(currentCourse)
        }
    }
}
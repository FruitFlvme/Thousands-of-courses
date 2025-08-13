package com.fruitflvme.feature_favorites

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.fruitflvme.domain.model.Course
import com.fruitflvme.domain.usecase.GetCoursesLikedUseCase
import com.fruitflvme.domain.usecase.ToggleLikeCourseUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class FavoritesViewModel @Inject constructor(
    private val getCoursesLikedUseCase: GetCoursesLikedUseCase,
    private val toggleLikeCourseUseCase: ToggleLikeCourseUseCase,
) : ViewModel() {
    private val _favoriteCourses = MutableStateFlow<List<Course>>(emptyList())
    val favoriteCourses: StateFlow<List<Course>> = _favoriteCourses.asStateFlow()

    init {
        viewModelScope.launch {
            getCoursesLikedUseCase()
                .collect { coursesList ->
                    _favoriteCourses.value = coursesList
                }
        }
    }

    fun toggleLike(course: Course) {
        viewModelScope.launch {
            toggleLikeCourseUseCase(course)
        }
    }
}
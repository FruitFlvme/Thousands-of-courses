package com.fruitflvme.feature_main.main

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.fruitflvme.domain.model.Course
import com.fruitflvme.domain.usecase.AddFavoriteCourseUseCase
import com.fruitflvme.domain.usecase.GetCoursesUseCase
import com.fruitflvme.domain.usecase.IsCourseLikedUseCase
import com.fruitflvme.domain.usecase.ToggleLikeCourseUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val isCourseLikedUseCase: IsCourseLikedUseCase,
    private val toggleLikeCourseUseCase: ToggleLikeCourseUseCase,
    private val getCoursesUseCase: GetCoursesUseCase,
    private val addFavoriteCourseUseCase: AddFavoriteCourseUseCase
) : ViewModel() {
    private val _courses = MutableStateFlow<List<Course>>(emptyList())
    val courses: StateFlow<List<Course>> = _courses

    private val originalCourses = mutableListOf<Course>()

    private val _isSortActive = MutableStateFlow(false)
    val isSortActive: StateFlow<Boolean> = _isSortActive.asStateFlow()

    private val _search = MutableStateFlow("")
    val search: StateFlow<String> = _search

    init {
        viewModelScope.launch {
            val coursesList = getCoursesUseCase()

            coursesList.filter { it.hasLike }.map { course ->
                async { addFavoriteCourseUseCase(course) }
            }.awaitAll()

            _courses.value = coursesList

            originalCourses.clear()
            originalCourses.addAll(coursesList)
        }
    }

    fun onSearchChange(newSearch: String) {
        _search.value = newSearch
    }

    fun isCourseLiked(courseId: Int): Flow<Boolean> =
        isCourseLikedUseCase(courseId)

    fun toggleLike(course: Course) {
        viewModelScope.launch {
            toggleLikeCourseUseCase(course)
        }
    }

    fun toggleSortOrder() {
        _isSortActive.value = !_isSortActive.value
        _courses.value = if (_isSortActive.value) {
            originalCourses.sortedByDescending { it.publishDate }
        } else {
            originalCourses.toList()
        }
    }
}
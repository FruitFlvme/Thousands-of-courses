package com.fruitflvme.feature_main.course

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController

@Composable
fun CourseDetailScreenWrapper(
    courseId: Int,
    navController: NavController
) {
    val viewModel: CourseDetailViewModel = hiltViewModel()
    val course by viewModel.course.collectAsState()
    val isFavorite by viewModel.isFavorite.collectAsState()
    
    course?.let {
        CourseDetailScreen(
            course = it,
            isFavorite = isFavorite,
            onToggleLike = { viewModel.toggleLike() },
            onClickBack = { navController.popBackStack() }
        )
    }
}

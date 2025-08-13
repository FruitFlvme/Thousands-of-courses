package com.fruitflvme.feature_favorites

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.fruitflvme.feature_main.course.CourseCard

@Composable
fun FavoritesScreen(
    navController: NavController,
    viewModel: FavoritesViewModel = hiltViewModel()
) {
    val courses by viewModel.favoriteCourses.collectAsState(initial = emptyList())

    Column(
        modifier = Modifier
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Text(
            text = "Избранное",
            style = MaterialTheme.typography.headlineLarge
        )

        LazyColumn(
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            items(courses, key = { course -> course.id }) { course ->
                CourseCard(
                    course = course,
                    isFavorite = true,
                    onToggleLike = { viewModel.toggleLike(course) },
                    onClickDetails = { navController.navigate("course_detail/${course.id}") },
                    modifier = Modifier.animateItem()
                )
            }
        }
    }
}

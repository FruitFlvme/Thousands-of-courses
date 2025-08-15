package com.fruitflvme.feature_main.main

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.fruitflvme.core.datastore.rememberUserPreferences
import com.fruitflvme.core.icons.IconsPack
import com.fruitflvme.core.icons.iconspack.ArrowDownUp
import com.fruitflvme.core.icons.iconspack.Funnel
import com.fruitflvme.core.icons.iconspack.Search
import com.fruitflvme.feature_main.course.CourseCard
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@Composable
fun MainScreen(
    navController: NavController,
    viewModel: MainViewModel
) {
    val search by viewModel.search.collectAsState()
    val isSortActive by viewModel.isSortActive.collectAsState(initial = false)
    val courses by viewModel.courses.collectAsState(initial = emptyList())

    val lazyListState = rememberLazyListState()
    val scope = rememberCoroutineScope()

    val isUserLoggedIn by rememberUserPreferences().isLoggedInFlow.collectAsState(initial = false)

    LaunchedEffect(isUserLoggedIn) {
        if (isUserLoggedIn) {
            println(">>> User is logged in, loading courses...")
            delay(300)
            viewModel.loadCourses()
        }
    }

    Column(
        modifier = Modifier
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Row(
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            modifier = Modifier.fillMaxWidth()
        ) {
            OutlinedTextField(
                readOnly = true,
                textStyle = MaterialTheme.typography.bodyMedium,
                value = search,
                onValueChange = { viewModel.onSearchChange(it) },
                placeholder = {
                    Text(
                        text = "Search courses...",
                        style = MaterialTheme.typography.bodyMedium
                    )
                },
                singleLine = true,
                keyboardOptions = KeyboardOptions(
                    autoCorrectEnabled = false,
                    keyboardType = KeyboardType.Email,
                    imeAction = ImeAction.Next
                ),
                shape = RoundedCornerShape(28.dp),
                colors = TextFieldDefaults.colors(
                    focusedContainerColor = MaterialTheme.colorScheme.surfaceVariant,
                    unfocusedContainerColor = MaterialTheme.colorScheme.surfaceVariant,
                    disabledContainerColor = MaterialTheme.colorScheme.surfaceVariant,
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent,
                    disabledIndicatorColor = Color.Transparent,
                ),
                leadingIcon = {
                    Icon(
                        imageVector = IconsPack.Search,
                        contentDescription = null
                    )
                },
                modifier = Modifier.weight(1f)
            )
            Button(
                onClick = {},
                modifier = Modifier.size(56.dp),
                shape = CircleShape,
                colors = ButtonDefaults.buttonColors(
                    containerColor = MaterialTheme.colorScheme.surfaceVariant,
                    contentColor = MaterialTheme.colorScheme.onSurface,
                    disabledContainerColor = MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.4f),
                    disabledContentColor = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.4f)
                ),
                contentPadding = PaddingValues(0.dp),
            ) {
                Icon(
                    imageVector = IconsPack.Funnel,
                    contentDescription = null,
                    tint = LocalContentColor.current
                )
            }
        }
        Row(
            horizontalArrangement = Arrangement.End,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth()
        ) {
            TextButton(
                onClick = {
                    val firstVisibleItemIndex = lazyListState.firstVisibleItemIndex
                    val firstVisibleItemScrollOffset = lazyListState.firstVisibleItemScrollOffset
                    viewModel.toggleSortOrder()
                    scope.launch {
                        lazyListState.scrollToItem(
                            firstVisibleItemIndex,
                            firstVisibleItemScrollOffset
                        )
                    }
                },
                colors = ButtonDefaults.textButtonColors(
                    containerColor = if (isSortActive) MaterialTheme.colorScheme.primary.copy(alpha = 0.12f) else Color.Transparent,
                    contentColor = if (isSortActive) MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.onSurface
                )
            ) {
                Row(
                    horizontalArrangement = Arrangement.spacedBy(2.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "По дате добавления",
                        style = MaterialTheme.typography.titleMedium,
                        color = MaterialTheme.colorScheme.primary
                    )
                    Icon(
                        imageVector = IconsPack.ArrowDownUp,
                        contentDescription = null,
                        tint = MaterialTheme.colorScheme.primary
                    )
                }
            }
        }

        println(">>> UI observes courses: ${courses.size}")

        LazyColumn(
            state = lazyListState,
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            items(courses, key = { course -> course.id }) { course ->
                val isFavorite by viewModel.isCourseLiked(course.id)
                    .collectAsState(initial = course.hasLike)
                CourseCard(
                    course = course,
                    isFavorite = isFavorite,
                    onToggleLike = { viewModel.toggleLike(course) },
                    onClickDetails = { navController.navigate("course_detail/${course.id}") },
                    modifier = Modifier.animateItem()
                )
            }
        }
    }
}
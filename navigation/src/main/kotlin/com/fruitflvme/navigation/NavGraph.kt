package com.fruitflvme.navigation

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.fruitflvme.core.datastore.UserPreferences
import com.fruitflvme.feature_account.AccountScreen
import com.fruitflvme.feature_auth.AuthScreen
import com.fruitflvme.feature_favorites.FavoritesScreen
import com.fruitflvme.feature_main.course.CourseDetailScreenWrapper
import com.fruitflvme.feature_main.main.MainScreen
import com.fruitflvme.feature_main.main.MainViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@Composable
fun NavGraph(
    navController: NavHostController,
    paddingValues: PaddingValues,
    isUserLoggedIn: Boolean,
    userPreferences: UserPreferences,
    coroutineScope: CoroutineScope,
    mainViewModel: MainViewModel
) {
    val startDestination = if (isUserLoggedIn) Screen.Main.route else Screen.Auth.route

    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = Modifier.padding(paddingValues)
    ) {
        composable(Screen.Auth.route) {
            AuthScreen(
                onAuthSuccess = {
                    coroutineScope.launch {
                        userPreferences.setLoggedIn(true)
                        navController.navigate(Screen.Main.route) {
                            popUpTo(Screen.Auth.route) { inclusive = true }
                            launchSingleTop = true
                            restoreState = false
                        }
                    }
                }
            )
        }

        composable(
            route = "${Screen.CourseDetail.route}/{courseId}",
            arguments = listOf(navArgument("courseId") { type = NavType.IntType })
        ) { backStackEntry ->
            val courseId = backStackEntry.arguments?.getInt("courseId") ?: 0
            CourseDetailScreenWrapper(courseId = courseId, navController = navController)
        }


        composable(Screen.Main.route) {
            MainScreen(navController = navController, viewModel = mainViewModel)
        }

        composable(Screen.Favorites.route) {
            FavoritesScreen(navController = navController)
        }

        composable(Screen.Account.route) {
            AccountScreen(
                onSignOut = {
                    coroutineScope.launch {
                        userPreferences.setLoggedIn(false)
                        navController.navigate(Screen.Auth.route) {
                            popUpTo(navController.graph.startDestinationId) {
                                inclusive = true
                            }
                            launchSingleTop = true
                            restoreState = false
                        }
                    }
                }
            )
        }
    }
}

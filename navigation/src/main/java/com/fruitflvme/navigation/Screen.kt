package com.fruitflvme.navigation

sealed class Screen(val route: String) {
    data object Auth : Screen("auth")
    data object Main : Screen("main")
    data object CourseDetail : Screen("course_detail")
    data object Favorites : Screen("favorites")
    data object Account : Screen("account")
}
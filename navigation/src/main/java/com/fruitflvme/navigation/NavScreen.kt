package com.fruitflvme.navigation

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Icon
import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.fruitflvme.core.datastore.rememberUserPreferences
import com.fruitflvme.core.icons.IconsPack
import com.fruitflvme.core.icons.iconspack.Bookmark
import com.fruitflvme.core.icons.iconspack.House
import com.fruitflvme.core.icons.iconspack.Person

@Composable
fun NavScreen() {
    val navController = rememberNavController()
    val userPreferences = rememberUserPreferences()

    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route

    var isUserLoggedIn by remember { mutableStateOf<Boolean?>(null) }
    val scope = rememberCoroutineScope()

    val isBottomVisible = when {
        currentRoute == null -> true
        currentRoute.startsWith(Screen.CourseDetail.route) -> false
        currentRoute == Screen.Auth.route -> false
        else -> true
    }

    LaunchedEffect(Unit) {
        userPreferences.isLoggedInFlow.collect { loggedIn ->
            isUserLoggedIn = loggedIn
        }
    }

    if (isUserLoggedIn == null) {
        Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
            CircularProgressIndicator()
        }
        return
    }

    Scaffold(
        bottomBar = {
            if (isBottomVisible)
                BottomNavigationBar(navController)
        }
    ) { paddingValues ->
        NavGraph(
            navController = navController,
            paddingValues = paddingValues,
            isUserLoggedIn = isUserLoggedIn!!,
            userPreferences = userPreferences,
            coroutineScope = scope
        )
    }
}

@Composable
fun BottomNavigationBar(navController: NavHostController) {
    val items = listOf(
        BottomNavItem("Главная", Screen.Main.route, IconsPack.House),
        BottomNavItem("Избранное", Screen.Favorites.route, IconsPack.Bookmark),
        BottomNavItem("Аккаунт", Screen.Account.route, IconsPack.Person)
    )
    NavigationBar {
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry?.destination?.route

        items.forEach { item ->
            val selected = currentRoute == item.route
            NavigationBarItem(
                icon = {
                    Icon(
                        imageVector = item.icon,
                        contentDescription = item.title,
                        tint = if (selected) MaterialTheme.colorScheme.primary else LocalContentColor.current
                    )
                },
                label = {
                    Text(
                        text = item.title,
                        color = if (selected) MaterialTheme.colorScheme.primary else Color.Unspecified
                    )
                },
                selected = selected,
                onClick = {
                    if (!selected) {
                        navController.navigate(item.route) {
                            popUpTo(Screen.Main.route) { saveState = true }
                            launchSingleTop = true
                            restoreState = true
                        }
                    }
                }
            )
        }
    }
}

data class BottomNavItem(val title: String, val route: String, val icon: ImageVector)
package com.fruitflvme.navigation

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.fruitflvme.core.datastore.rememberUserPreferences
import com.fruitflvme.feature_main.main.MainViewModel

@Composable
fun NavScreen() {
    val navController = rememberNavController()
    val userPreferences = rememberUserPreferences()

    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route

    var isUserLoggedIn by remember { mutableStateOf<Boolean?>(null) }
    val scope = rememberCoroutineScope()

    val mainViewModel: MainViewModel = hiltViewModel()

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
            coroutineScope = scope,
            mainViewModel = mainViewModel
        )
    }
}


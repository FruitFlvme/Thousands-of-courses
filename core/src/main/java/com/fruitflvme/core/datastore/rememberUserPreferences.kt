package com.fruitflvme.core.datastore

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.platform.LocalContext

@Composable
fun rememberUserPreferences(): UserPreferences {
    val context = LocalContext.current.applicationContext
    return remember { UserPreferences(context) }
}

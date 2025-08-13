package com.fruitflvme.core.datastore

import android.content.Context
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.edit
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class UserPreferences(private val context: Context) {

    private val dataStore = context.userPrefsDataStore

    private val key = booleanPreferencesKey("logged_in")

    val isLoggedInFlow: Flow<Boolean> = dataStore.data
        .map { preferences ->
            preferences[key] ?: false
        }

    suspend fun setLoggedIn(isLoggedIn: Boolean) {
        dataStore.edit { preferences ->
            preferences[key] = isLoggedIn
        }
    }
}
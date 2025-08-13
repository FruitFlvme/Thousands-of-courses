package com.fruitflvme.feature_auth

sealed class AuthUiState {
    data object Idle : AuthUiState()
    data object Success : AuthUiState()
    data class Error(val message: String) : AuthUiState()
}
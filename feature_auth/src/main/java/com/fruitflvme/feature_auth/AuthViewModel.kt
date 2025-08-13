package com.fruitflvme.feature_auth

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class AuthViewModel @Inject constructor(
) : ViewModel() {
    private val _email = MutableStateFlow("")
    val email: StateFlow<String> = _email

    private val _password = MutableStateFlow("")
    val password: StateFlow<String> = _password

    private val _uiState = MutableStateFlow<AuthUiState>(AuthUiState.Idle)
    val uiState: StateFlow<AuthUiState> = _uiState

    private val _isSignInEnabled = MutableStateFlow(false)
    val isSignInEnabled: StateFlow<Boolean> = _isSignInEnabled

    private val _openUrlEvent = MutableSharedFlow<String>()
    val openUrlEvent = _openUrlEvent.asSharedFlow()

    private val emailRegex = Regex("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}\$")

    fun onEmailChange(newEmail: String) {
        _email.value = newEmail
        validateInputs()
    }

    fun onPasswordChange(newPassword: String) {
        _password.value = newPassword
        validateInputs()
    }

    private fun validateInputs() {
        val isEmailValid = emailRegex.matches(_email.value)
        val isPasswordValid = _password.value.isNotBlank()
        _isSignInEnabled.value = isEmailValid && isPasswordValid
    }

    fun signIn() {
        viewModelScope.launch {
            _uiState.value = AuthUiState.Success
        }
    }

    fun resetState() {
        _uiState.value = AuthUiState.Idle
    }

    fun onClickUrl(url: String) {
        viewModelScope.launch {
            _openUrlEvent.emit(url)
        }
    }
}
package com.catnip.firebaseauthexample.data.repository

import com.catnip.firebaseauthexample.utils.ResultWrapper
import com.google.firebase.auth.FirebaseUser
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport
import kotlinx.coroutines.flow.Flow

interface UserRepository {
    fun isLoggedIn(): Boolean
    fun getCurrentUser(): CrashlyticsReport.Session.User?
    fun doLogout(): Boolean
    suspend fun doRegister(
        fullName: String,
        email: String,
        password: String): Flow<ResultWrapper<Boolean>>
    suspend fun doLogin(email: String, password: String): Flow<ResultWrapper<Boolean>>
}
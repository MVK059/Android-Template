package com.mvk.app.data.api

import com.mvk.app.data.model.User
import retrofit2.Response

interface ApiHelper {

    suspend fun getUsers(): Response<List<User>>
}
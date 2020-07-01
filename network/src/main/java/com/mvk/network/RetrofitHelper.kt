package com.mvk.network

import com.mvk.network.models.DummySearchApiResult
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.http.GET
import retrofit2.http.Query

object RetrofitHelper {

    interface ApiService {

        @GET("search")
        suspend fun searchDummy(
            @Query("dummy") dummy: Int
        ): Response<DummySearchApiResult>
    }

    fun dummySearchApi(retrofit: Retrofit): ApiService {
        return retrofit.create(ApiService::class.java)
    }
}
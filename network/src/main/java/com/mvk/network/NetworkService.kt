package com.mvk.network

import com.mvk.network.request.DummyRequest
import com.mvk.network.response.DummyResponse
import retrofit2.http.Body
import retrofit2.http.Header
import retrofit2.http.POST
import javax.inject.Singleton

@Singleton
interface NetworkService {


    @POST(NetworkEndpoints.DUMMY)
    fun doDummyCall(
        @Body request: DummyRequest,
        @Header(Networking.HEADER_API_KEY) apiKey: String = Networking.API_KEY // default value set when Networking create is called
    ): DummyResponse

}
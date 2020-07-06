package com.mvk.base.utils.network

import com.google.gson.annotations.SerializedName

data class NetworkError(
    val status: Int = -1,
    @SerializedName("statusCode")
    val statusCode: String = "-1",
    @SerializedName("message")
    val message: String = "Something went wrong"
)
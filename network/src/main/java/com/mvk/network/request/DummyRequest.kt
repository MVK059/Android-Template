package com.mvk.network.request

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class DummyRequest(
    @SerializedName("id")
    var id: String
)
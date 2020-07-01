package com.mvk.network.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
data class RestaurantApiResult(
    @SerialName("dummy")
    val dummy: String
)
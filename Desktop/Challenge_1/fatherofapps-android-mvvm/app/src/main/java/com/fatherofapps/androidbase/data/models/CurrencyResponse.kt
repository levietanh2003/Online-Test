package com.fatherofapps.androidbase.data.models

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CurrencyResponse(
    val currencies: Map<String, String>,
    val ms: Int
)


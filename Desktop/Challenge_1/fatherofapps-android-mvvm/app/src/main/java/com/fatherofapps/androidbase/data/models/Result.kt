package com.fatherofapps.androidbase.data.models

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Result(
    val convertedAmount : Map<String, Float>,
    val rate: Float
)


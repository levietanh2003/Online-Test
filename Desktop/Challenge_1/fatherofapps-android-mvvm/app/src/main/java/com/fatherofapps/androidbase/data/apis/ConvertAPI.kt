package com.fatherofapps.androidbase.data.apis

import com.fatherofapps.androidbase.data.models.ForexResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ConvertAPI {
    @GET("convert")
    fun getExchangeRate(
        @Query("from") from: String,
        @Query("to") to: String,
        @Query("amount") amount: Float,
        @Query("precision") precision: Int? = null,
//        @Query("api_key") apiKey: String // Khóa API
    ): Response<ForexResponse>
}
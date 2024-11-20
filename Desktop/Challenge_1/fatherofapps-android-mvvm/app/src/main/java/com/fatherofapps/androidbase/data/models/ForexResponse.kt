package com.fatherofapps.androidbase.data.models

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ForexResponse(
    val base: String, // Mã tiền tệ gốc
    val amount: Float, // Số tiền cần chuyển đổi
    val result: Map<String, Double>, // Kết quả chuyển đổi
    val ms: Int // Thời gian xử lý
)

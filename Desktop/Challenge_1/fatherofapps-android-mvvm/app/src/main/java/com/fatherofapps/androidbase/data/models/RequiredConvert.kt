package com.fatherofapps.androidbase.data.models

data class RequiredConvert(
    val from: String, // Mã tiền tệ gốc
    val to: String, // Mã tiền tệ đích
    val amount: Float, // Số tiền cần chuyển đổi
    val precision: Int? = null, // Độ chính xác (0-20)
    )

package com.fatherofapps.androidbase.data.services

import com.fatherofapps.androidbase.base.network.BaseRemoteService
import com.fatherofapps.androidbase.base.network.NetworkResult
import com.fatherofapps.androidbase.data.apis.FastForexAPI
import com.fatherofapps.androidbase.data.models.CurrencyResponse
import com.fatherofapps.androidbase.data.models.ForexResponse
import com.fatherofapps.androidbase.data.models.RequiredConvert
import com.fatherofapps.androidbase.di.IoDispatcher
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.withContext
import javax.inject.Inject

class CurrencyRemoteServices @Inject constructor(
    private val fastForexAPI: FastForexAPI,
    @IoDispatcher private val dispatcher: CoroutineDispatcher
) : BaseRemoteService() {

    suspend fun fetchCurrencies(): NetworkResult<CurrencyResponse> = withContext(dispatcher) {
        callApi { fastForexAPI.getCurrencies() }
    }

    // Hàm lấy tỷ giá chuyển đổi tiền tệ
    suspend fun getExchangeRate(
        requiredConvert: RequiredConvert
    ): NetworkResult<ForexResponse> = withContext(dispatcher) {
        callApi {
            fastForexAPI.getExchangeRate(requiredConvert.from,requiredConvert.to, requiredConvert.amount, requiredConvert.precision)
        }
    }

    suspend fun getExchangeRate1(
        from: String, to: String, amount: Float, precision: Int? = null
    ): NetworkResult<ForexResponse> = withContext(dispatcher) {
        callApi {
            fastForexAPI.getExchangeRate(from,to, amount, precision)
        }
    }

}
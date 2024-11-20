package com.fatherofapps.androidbase.data.repositories

import com.fatherofapps.androidbase.base.network.NetworkResult
import com.fatherofapps.androidbase.data.models.CurrencyResponse
import com.fatherofapps.androidbase.data.models.ForexResponse
import com.fatherofapps.androidbase.data.services.CurrencyRemoteServices
import com.fatherofapps.androidbase.di.IoDispatcher
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.withContext
import javax.inject.Inject

class CurrencyRepository @Inject constructor (
    private val currencyRemoteServices: CurrencyRemoteServices,
    @IoDispatcher private val dispatcher: CoroutineDispatcher
){
    suspend fun fetchCurrencies(): NetworkResult<CurrencyResponse> = withContext(dispatcher) {
        // Call the service to fetch currencies
        return@withContext currencyRemoteServices.fetchCurrencies()
    }

    suspend fun testConvert(from: String, to: String, amount: Float, precision: Int? = null) : NetworkResult<ForexResponse> = withContext(dispatcher) {
        return@withContext currencyRemoteServices.getExchangeRate1(from,to, amount, precision)

    }
}
package com.fatherofapps.androidbase.ui.home

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.fatherofapps.androidbase.base.network.NetworkResult
import com.fatherofapps.androidbase.base.viewmodel.BaseViewModel
import com.fatherofapps.androidbase.data.repositories.CurrencyRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val currencyRepository: CurrencyRepository
) : BaseViewModel() {

    private val _resultConvert = MutableLiveData<NetworkResult<Map<String, Double>>>()
    val resultConvert: LiveData<NetworkResult<Map<String, Double>>> get() = _resultConvert

    fun fetchResultConvert(from: String, to: String, amount: Float, precision: Int? = null) {
        showLoading(true)
        parentJob = viewModelScope.launch(handler) { // Sử dụng handler để xử lý lỗi toàn cục
            when (val result = currencyRepository.testConvert(from, to, amount, precision)) {
                is NetworkResult.Success -> {
                    // Cập nhật kết quả trả về dạng Map<String, Double>
                    val conversionResult = result.data.result
                    _resultConvert.postValue(NetworkResult.Success(conversionResult))
                    Log.d("HomeViewModel", "Conversion Result: $conversionResult")
                }
                is NetworkResult.Error -> {
                    // Xử lý lỗi nếu cần
                    _resultConvert.postValue(NetworkResult.Error(result.exception))
                    Log.e("HomeViewModel", "Error: ${result.exception}")
                }
            }
            registerJobFinish() // Đánh dấu job đã hoàn thành
        }
    }
}
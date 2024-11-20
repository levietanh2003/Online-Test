package com.fatherofapps.androidbase.ui.currency

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
class CurrencyViewModel @Inject constructor(
    private val currencyRepository: CurrencyRepository
) : BaseViewModel() {

    // LiveData để chứa dữ liệu Map<String, String>
    private val _currencies = MutableLiveData<Map<String, String>>()
    val currencies: LiveData<Map<String, String>> get() = _currencies

    override fun fetchData() {
        showLoading(true)
        parentJob = viewModelScope.launch {
            when (val result = currencyRepository.fetchCurrencies()) {
                is NetworkResult.Success -> {
                    // Cập nhật giá trị vào LiveData khi thành công
                    _currencies.postValue(result.data.currencies)
                }
                is NetworkResult.Error -> {
                    // Xử lý lỗi nếu cần
                    _currencies.postValue(emptyMap())
                }
                else -> {
                    _currencies.postValue(emptyMap())
                }
            }
        }
    }

}
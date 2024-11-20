package com.fatherofapps.androidbase.ui.home

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.fatherofapps.androidbase.base.fragment.BaseFragment
import com.fatherofapps.androidbase.base.network.NetworkResult
import com.fatherofapps.androidbase.data.models.RequiredConvert
import com.fatherofapps.androidbase.databinding.FragmentHomeBinding
import com.fatherofapps.androidbase.ui.currency.CurrencyBottomSheetFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeFragment : BaseFragment() {

    private lateinit var binding: FragmentHomeBinding
    private val viewModel: HomeViewModel by viewModels()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        parentFragmentManager.setFragmentResultListener("filter_request_key", this) { _, bundle ->
            // Lấy dữ liệu đã chọn từ bundle
            val selectedCurrencyCodeFrom = bundle.getString("selected_currencyCode_from")
            val selectedCurrencyCodeTo = bundle.getString("selected_currencyCode_to")

            // Cập nhật TextViews tương ứng
            selectedCurrencyCodeFrom?.let {
                binding.txtFromCurrency.text = it
            }
            selectedCurrencyCodeTo?.let {
                binding.txtToCurrency.text = it
            }
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        binding.viewModel = viewModel
        binding.lifecycleOwner = viewLifecycleOwner

        registerObserverNetworkExceptionEvent(viewModel,viewLifecycleOwner)
        registerObserverMessageEvent(viewModel,viewLifecycleOwner)

        binding.txtFromCurrency.setOnClickListener {
            openBottomSheetCurrency(true) // "From Currency"
        }

        binding.txtToCurrency.setOnClickListener {
            openBottomSheetCurrency(false) // "To Currency"
        }

        binding.buttonConvert.setOnClickListener {

            val from = binding.txtFromCurrency.text.toString()
            val to = binding.txtToCurrency.text.toString()
            val amount = binding.editTextFromAmount.text.toString().toFloatOrNull() ?: 0f

            viewModel.fetchResultConvert(from, to, amount)

            viewModel.resultConvert.observe(viewLifecycleOwner) { result ->
                when (result) {
                    is NetworkResult.Success -> {
                        result.data.let { map ->
                            val firstEntry = map.entries.firstOrNull() // Lấy cặp đầu tiên trong Map
                            firstEntry?.let { (currency, value) ->
//                                val formattedAmount = String.format("%.2f", value) // Định dạng giá trị số
                                binding.textViewToAmount.text = "$value" // Hiển thị vào TextView
                                Log.d("Currency Conversion", "First Entry - $currency: $value")
                            } ?: run {
                                Log.w("Currency Conversion", "Map is empty!")
                                binding.textViewToAmount.text = "No data available"
                            }
                        }
                    }
                    is NetworkResult.Error -> {
                        // Hiển thị lỗi
                        showNotify("Kiểm tra lại mạng","Thông báo")

                    }
                    is NetworkResult.Loading -> {
                        // Hiển thị trạng thái loading nếu cần
                        binding.textViewToAmount.text = "Loading..."
                    }
                }
            }
        }
        return binding.root
    }

    private fun openBottomSheetCurrency(isFromCurrency: Boolean) {
        val bottomSheetFragment = CurrencyBottomSheetFragment()

        // Truyền thông tin "isFromCurrency" để xác định xem đây là "From Currency" hay "To Currency"
        val bundle = Bundle()
        bundle.putBoolean("is_from_currency", isFromCurrency)
        bottomSheetFragment.arguments = bundle

        bottomSheetFragment.show(parentFragmentManager, bottomSheetFragment.tag)
    }

    // thu thap input cua nguoi dung
    private fun getInput(): RequiredConvert {
        val from = binding.txtFromCurrency.text.toString()
        val to = binding.txtToCurrency.text.toString()
        val amount = binding.editTextFromAmount.text.toString().toFloatOrNull() ?: 0f

        return RequiredConvert(from, to, amount)
    }
}

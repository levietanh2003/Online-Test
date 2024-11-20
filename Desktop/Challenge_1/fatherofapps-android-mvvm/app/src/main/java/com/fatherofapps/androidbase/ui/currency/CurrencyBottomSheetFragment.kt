package com.fatherofapps.androidbase.ui.currency

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.setFragmentResult
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.fatherofapps.androidbase.databinding.BottomSheetCurrenvyLayoutBinding
import com.fatherofapps.androidbase.ui.adapters.CurrencyAdapter
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class CurrencyBottomSheetFragment : BottomSheetDialogFragment() {

    private lateinit var currencyAdapter: CurrencyAdapter
    private val viewModel: CurrencyViewModel by viewModels()
    private lateinit var binding: BottomSheetCurrenvyLayoutBinding

    // Flag để xác định từ/to
    private var isFromCurrency = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Nhận giá trị từ HomeFragment (isFromCurrency)
        isFromCurrency = arguments?.getBoolean("is_from_currency", false) ?: false
        viewModel.fetchData()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = BottomSheetCurrenvyLayoutBinding.inflate(inflater, container, false)
        val recyclerView = binding.currencyRecyclerView
        recyclerView.layoutManager = LinearLayoutManager(context)

        // Quan sát LiveData từ ViewModel
        viewModel.currencies.observe(viewLifecycleOwner) { currencies ->
            if (currencies.isNotEmpty()) {
                // Khi có dữ liệu, cập nhật adapter và truyền callback xử lý click
                currencyAdapter = CurrencyAdapter(currencies) { currencyCode ->
                    Log.d("CurrencyBottomSheet", "Item clicked: $currencyCode")

                    // Gửi kết quả về HomeFragment
                    val result = Bundle().apply {
                        if (isFromCurrency) {
                            putString("selected_currencyCode_from", currencyCode)
                        } else {
                            putString("selected_currencyCode_to", currencyCode)
                        }
                    }

                    setFragmentResult("filter_request_key", result)
                    dismiss() // Đóng BottomSheet sau khi chọn
                }
                recyclerView.adapter = currencyAdapter
            }
        }
        return binding.root
    }
}


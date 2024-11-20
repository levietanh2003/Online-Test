package com.fatherofapps.androidbase.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.fatherofapps.androidbase.databinding.CurrencyItemBinding

class CurrencyAdapter(
    private val currencies: Map<String, String>,
    private val onItemClick: (String) -> Unit // Thêm callback để xử lý click
) : RecyclerView.Adapter<CurrencyAdapter.CurrencyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CurrencyViewHolder {
        val binding = CurrencyItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CurrencyViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CurrencyViewHolder, position: Int) {
        val currencyCode = currencies.keys.elementAt(position)
        val currencyName = currencies[currencyCode]
        holder.bind(currencyCode, currencyName)


        // Xử lý sự kiện click
        holder.itemView.setOnClickListener {
            onItemClick(currencyCode) // Gọi callback với giá trị key khi item được click
        }
    }

    override fun getItemCount(): Int {
        return currencies.size
    }

    class CurrencyViewHolder(private val binding: CurrencyItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(currencyCode: String, currencyName: String?) {
            binding.currencyCode.text = currencyCode
            binding.currencyName.text = currencyName
        }
    }
}

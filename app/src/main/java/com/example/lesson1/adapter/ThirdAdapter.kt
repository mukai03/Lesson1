package com.example.lesson1.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.lesson1.databinding.ItemThirdBinding

class ThirdAdapter : RecyclerView.Adapter<ThirdAdapter.ThirdViewHolder>() {

    private var operations = arrayListOf<String>()

    inner class ThirdViewHolder(private val binding: ItemThirdBinding)
        : RecyclerView.ViewHolder(binding.root) {
        fun bind(text: String) {
            binding.textView.text = text
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ThirdViewHolder {
        return ThirdViewHolder(ItemThirdBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: ThirdViewHolder, position: Int) = holder.bind(operations[position])

    override fun getItemCount(): Int = operations.size

    @SuppressLint("NotifyDataSetChanged")
    fun initList(list: ArrayList<String>) {
        operations = list
        notifyDataSetChanged()
    }
}
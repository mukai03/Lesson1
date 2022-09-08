package com.example.lesson1.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.lesson1.MainViewModel
import com.example.lesson1.databinding.FragmentThirdBinding
import com.example.lesson1.adapter.ThirdAdapter

class ThirdFragment : Fragment() {

    private lateinit var binding: FragmentThirdBinding
    private lateinit var viewModel: MainViewModel
    private val adapter = ThirdAdapter()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        viewModel = ViewModelProvider(requireActivity())[MainViewModel::class.java]
        binding = FragmentThirdBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.recyclerView.adapter = adapter
        viewModel.result.observe(viewLifecycleOwner) {
            adapter.initList(it)
            println(it.toString())
        }

        /*val list = arrayListOf<String>()
        viewModel.onIncrementClick().apply{
            list.add("+")
        }
        viewModel.onDecrementClick().apply {
            list.add("-")
        }

        adapter = ThirdAdapter(list)
        binding.recyclerView.adapter = adapter*/
    }



}
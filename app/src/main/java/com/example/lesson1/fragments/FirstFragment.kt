package com.example.lesson1.fragments

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
<<<<<<< HEAD
import androidx.fragment.app.viewModels
=======
>>>>>>> bd9a758 (1.1)
import androidx.lifecycle.ViewModelProvider
import com.example.lesson1.MainViewModel
import com.example.lesson1.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {

    private lateinit var binding: FragmentFirstBinding
    private lateinit var viewModel: MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFirstBinding.inflate(layoutInflater)
        viewModel = ViewModelProvider(requireActivity())[MainViewModel::class.java]
        return binding.root
    }

    @SuppressLint("FragmentLiveDataObserve")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnIncrement.setOnClickListener {
            viewModel.onIncrementClick()
        }

        binding.btnDecrement.setOnClickListener {
            viewModel.onDecrementClick()
        }

        viewModel.counter.observe(this) {
            binding.textViewDetails.text = it.toString()
        }
    }
}
package com.allaber.iqtest.screens.main.home.view

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.allaber.iqtest.R
import com.allaber.iqtest.databinding.FragmentMainHomeBinding


class HomeFragment : Fragment(R.layout.fragment_main_home) {

    private val binding by viewBinding(FragmentMainHomeBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupListeners()
    }

    private fun setupListeners() {
        clickStart()
    }

    private fun clickStart() {
        binding.button.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_infoFragment)
        }
    }
}
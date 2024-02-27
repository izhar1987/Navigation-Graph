package com.demo.navigationgraph.ui.fragments

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.demo.navigationgraph.databinding.FragmentSendCashBinding


class SendCashFragment: Fragment() {
    private var _binding: FragmentSendCashBinding? = null
    private val binding get() = _binding!!

    @SuppressLint("SetTextI18n")
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val navController = findNavController()
        _binding = FragmentSendCashBinding.inflate(inflater, container, false)

        val receiverName = arguments?.getString("name")
        binding.txtReceiverText.text = "Send Cash to $receiverName"
        return _binding!!.getRoot()
    }
}
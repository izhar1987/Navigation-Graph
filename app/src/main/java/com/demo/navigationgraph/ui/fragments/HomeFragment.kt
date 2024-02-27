package com.demo.navigationgraph.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.NavOptions
import androidx.navigation.fragment.findNavController
import com.demo.navigationgraph.R
import com.demo.navigationgraph.databinding.FragmentHomeBinding
import com.demo.navigationgraph.databinding.FragmentViewbalanceBinding


class HomeFragment : Fragment() {
    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val navController = findNavController()
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        binding.btnViewBalance.setOnClickListener {
            val navOption = NavOptions.Builder().setEnterAnim(R.anim.slide_in_right)
                .setExitAnim(R.anim.slide_out_left)
                .setPopEnterAnim(R.anim.slide_in_left)
                .setPopExitAnim(R.anim.slide_out_right)
                .build()
            navController.navigate(
                R.id.action_homeFragment_to_viewBalanceFragment,
                args = null,
                navOption
            )
        }
        binding.btnViewTransaction.setOnClickListener {
            val navOption = NavOptions.Builder().setEnterAnim(R.anim.slide_in_right)
                .setExitAnim(R.anim.slide_out_left)
                .setPopEnterAnim(R.anim.slide_in_left)
                .setPopExitAnim(R.anim.slide_out_right)
                .build()
            navController.navigate(
                R.id.action_homeFragment_to_viewTransactionFragment,
                args = null,
                navOption
            )
        }
        binding.btnSendMoney.setOnClickListener {
            val navOption = NavOptions.Builder().setEnterAnim(R.anim.slide_in_right)
                .setExitAnim(R.anim.slide_out_left)
                .setPopEnterAnim(R.anim.slide_in_left)
                .setPopExitAnim(R.anim.slide_out_right)
                .build()
            navController.navigate(
                R.id.action_homeFragment_to_chooseReceiverFragment,
                args = null,
                navOption
            )
        }
        return _binding!!.getRoot()
    }
}
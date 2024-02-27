package com.demo.navigationgraph.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.NavOptions
import androidx.navigation.fragment.findNavController
import com.demo.navigationgraph.R
import com.demo.navigationgraph.databinding.FragmentChooseReceiverBinding


class ChooseReceiverFragment : Fragment() {

    private var _binding: FragmentChooseReceiverBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val navController = findNavController()
        _binding = FragmentChooseReceiverBinding.inflate(inflater, container, false)
        binding.btnNext.setOnClickListener {
            val navOption = NavOptions.Builder().setEnterAnim(R.anim.slide_in_right)
                .setExitAnim(R.anim.slide_out_left)
                .setPopEnterAnim(R.anim.slide_in_left)
                .setPopExitAnim(R.anim.slide_out_right)
                .build()
            val receiverName = binding.edTxt.text.toString()
            val args = Bundle()
            args.putString("name",receiverName)
            navController.navigate(
                R.id.action_chooseReceiverFragment_to_sendCashFragment2,
                args,
                navOption
            )
        }
        return _binding!!.getRoot()
    }
}
package com.example.myapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.myapp.databinding.FragmentHotBinding
import com.example.myapp.databinding.FragmentMeatBinding
import com.example.myapp.databinding.FragmentRiceBinding
import com.example.myapp.databinding.FragmentSecondBinding

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class hot : Fragment() {

    private var _binding: FragmentHotBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentHotBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.button102.setOnClickListener {
            findNavController().navigate(R.id.action_hot_to_result412)
        }
        binding.button101.setOnClickListener {
            findNavController().navigate(R.id.action_hot_to_result42)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
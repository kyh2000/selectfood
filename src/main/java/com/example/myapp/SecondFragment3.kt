package com.example.myapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.myapp.databinding.FragmentSecond2Binding
import com.example.myapp.databinding.FragmentSecond3Binding
import com.example.myapp.databinding.FragmentSecondBinding

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class SecondFragment3 : Fragment() {

    private var _binding: FragmentSecond3Binding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentSecond3Binding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.rice5.setOnClickListener {
            findNavController().navigate(R.id.action_secondFragment3_to_rice32)
        }
        binding.myeon6.setOnClickListener {
            findNavController().navigate(R.id.action_secondFragment3_to_myeon3)
        }
        binding.meat6.setOnClickListener {
            findNavController().navigate(R.id.action_secondFragment3_to_meat3)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
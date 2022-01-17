package com.example.myapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.myapp.databinding.FragmentSecond2Binding
import com.example.myapp.databinding.FragmentSecond3Binding
import com.example.myapp.databinding.FragmentSecond4Binding
import com.example.myapp.databinding.FragmentSecondBinding

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class SecondFragment4 : Fragment() {

    private var _binding: FragmentSecond4Binding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentSecond4Binding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.rice6.setOnClickListener {
            findNavController().navigate(R.id.action_secondFragment42_to_rice4)
        }
        binding.myeon7.setOnClickListener {
            findNavController().navigate(R.id.action_secondFragment42_to_myeon4)
        }
        binding.meat7.setOnClickListener {
            findNavController().navigate(R.id.action_secondFragment42_to_meat4)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
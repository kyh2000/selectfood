package com.example.myapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.myapp.databinding.FragmentSecond2Binding
import com.example.myapp.databinding.FragmentSecondBinding

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class SecondFragment2 : Fragment() {

    private var _binding: FragmentSecond2Binding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentSecond2Binding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.rice3.setOnClickListener {
            findNavController().navigate(R.id.action_secondFragment22_to_rice22)
        }
        binding.myeon5.setOnClickListener {
            findNavController().navigate(R.id.action_secondFragment22_to_myeon22)
        }
        binding.meat5.setOnClickListener {
            findNavController().navigate(R.id.action_secondFragment22_to_meat22)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
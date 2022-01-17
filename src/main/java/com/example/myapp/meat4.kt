package com.example.myapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.myapp.databinding.*

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class meat4 : Fragment() {

    private var _binding: FragmentMeat4Binding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentMeat4Binding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.button52.setOnClickListener {
            findNavController().navigate(R.id.action_meat4_to_oily3)
        }
        binding.button51.setOnClickListener {
            findNavController().navigate(R.id.action_meat4_to_nooily3)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
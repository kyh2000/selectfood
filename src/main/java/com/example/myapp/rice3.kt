package com.example.myapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.myapp.databinding.FragmentRice2Binding
import com.example.myapp.databinding.FragmentRice3Binding
import com.example.myapp.databinding.FragmentSecond2Binding
import com.example.myapp.databinding.FragmentSecondBinding

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class rice3 : Fragment() {

    private var _binding: FragmentRice3Binding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentRice3Binding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.button42.setOnClickListener {
            findNavController().navigate(R.id.action_rice32_to_result19)
        }
        binding.button41.setOnClickListener {
            findNavController().navigate(R.id.action_rice32_to_nosoup3)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
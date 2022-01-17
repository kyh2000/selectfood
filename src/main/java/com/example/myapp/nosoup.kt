package com.example.myapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.myapp.databinding.FragmentNosoupBinding
import com.example.myapp.databinding.FragmentRiceBinding
import com.example.myapp.databinding.FragmentSecondBinding
import com.example.myapp.databinding.FragmentSoupBinding

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class nosoup : Fragment() {

    private var _binding: FragmentNosoupBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentNosoupBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.button7.setOnClickListener {
            findNavController().navigate(R.id.action_nosoup_to_result2)
        }
        binding.button8.setOnClickListener {
            findNavController().navigate(R.id.action_nosoup_to_result3  )
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
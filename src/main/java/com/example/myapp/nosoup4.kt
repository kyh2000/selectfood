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
class nosoup4 : Fragment() {

    private var _binding: FragmentNosoup4Binding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentNosoup4Binding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.button38.setOnClickListener {
            findNavController().navigate(R.id.action_nosoup3_to_result20)
        }
        binding.button37.setOnClickListener {
            findNavController().navigate(R.id.action_nosoup3_to_result211)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
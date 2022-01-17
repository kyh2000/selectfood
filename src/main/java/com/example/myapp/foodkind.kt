package com.example.myapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.myapp.databinding.FragmentFirstBinding
import com.example.myapp.databinding.FragmentFoodkindBinding

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class foodkind : Fragment() {

    private var _binding: FragmentFoodkindBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentFoodkindBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.korean.setOnClickListener {
            findNavController().navigate(R.id.action_foodkind_to_SecondFragment)
        }
        binding.usa.setOnClickListener {
            findNavController().navigate(R.id.action_foodkind_to_secondFragment2)
        }
        binding.chinese.setOnClickListener {
            findNavController().navigate(R.id.action_foodkind_to_secondFragment3)
        }
        binding.japanese.setOnClickListener {
            findNavController().navigate(R.id.action_foodkind_to_secondFragment4)
        }
        binding.bread.setOnClickListener {
            findNavController().navigate(R.id.action_foodkind_to_secondFragment5)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
package com.example.navigationsample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import com.example.navigationsample.databinding.FragmentTwoBinding

class FragmentTwo : Fragment() {

    private lateinit var binding:FragmentTwoBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       binding= FragmentTwoBinding.inflate(layoutInflater, container, false)

        binding.moveToThirdScreen.setOnClickListener {

           // val bundle= bundleOf("name" to binding.editTextTextPersonName.text.toString())
           // findNavController().navigate(R.id.fragmentThree,bundle)

            val action = FragmentTwoDirections.actionFragmentTwoToFragmentThree(binding.editTextTextPersonName.text.toString())
            findNavController().navigate(action)
        }
        return binding.root
    }


}
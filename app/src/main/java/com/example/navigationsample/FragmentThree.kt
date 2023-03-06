package com.example.navigationsample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.example.navigationsample.databinding.FragmentThreeBinding


class FragmentThree : Fragment() {

    private lateinit var binding: FragmentThreeBinding
    val args : FragmentThreeArgs by navArgs()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding= FragmentThreeBinding.inflate(layoutInflater, container, false)

//       val name= requireArguments().getString("name")
        val name= args.nameofperson

        binding.textViewAtThirdScreen.text="Welcome "+ name+" to Third Screen"

        return binding.root
    }

}
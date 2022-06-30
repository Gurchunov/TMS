package com.example.tms.dz16

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.tms.R
import com.example.tms.databinding.FragmentDz16Binding

class Dz16Fragment : Fragment() {
    private lateinit var binding: FragmentDz16Binding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDz16Binding.inflate(inflater, container, false)
        binding.apply {
            btnCount.setOnClickListener {
                binding.tvIsEven.visibility = View.VISIBLE
                isEvenA(ptInputNumber.text.toString().toInt())
            }
            btnCount2.setOnClickListener {
                binding.tvInfo.visibility = View.VISIBLE
                max(
                    ptNumberA.text.toString().toInt(),
                    ptNumberB.text.toString().toInt(),
                    ptNumberC.text.toString().toInt()
                )
            }
        }
        return binding.root
    }

    private fun isEvenA(a: Int) {
        when (a % 2 == 0) {
            true -> binding.tvIsEven.text = "число $a четное"
            false -> binding.tvIsEven.text = "число $a нечетное"
        }
    }

    private fun max(a: Int, b: Int, c: Int) {
        val plus = a + b + c
        val multiPlay = a * b * c
        when {
            plus == multiPlay -> binding.tvInfo.text = "значения равны"
            plus > multiPlay -> binding.tvInfo.text = "$plus > $multiPlay"
            plus < multiPlay -> binding.tvInfo.text = "$plus < $multiPlay"
        }
    }
}
package com.example.tms.dz15

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.tms.databinding.FragmentDz15Binding

class Dz15Fragment : Fragment() {

    private lateinit var binding: FragmentDz15Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDz15Binding.inflate(inflater, container, false)
        binding.apply {
            btnCheck.setOnClickListener {
                tvNotification.visibility = View.VISIBLE
                randomNumber(edTextNumber.text.toString().toInt())
            }
        }
        return binding.root
    }

    private fun randomNumber(x: Int) {
        val range = 25..100
        if (x in 6..154) {
            if (x in range) {
                binding.tvNotification.text = "число $x попадает в искомый интервал"
            } else {
                binding.tvNotification.text = "число $x непопадает в искомый интервал"
            }
        } else {
            binding.tvNotification.text = "вы вышли за рамки набора значений"
        }
    }

    companion object {
        @JvmStatic
        fun newInstance() = Dz15Fragment()
    }
}

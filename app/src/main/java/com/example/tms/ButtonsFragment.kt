package com.example.tms

import android.os.Binder
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.tms.databinding.FragmentButtonsBinding
import com.example.tms.dz14.Dz14Fragment


class ButtonsFragment : Fragment() {

    private lateinit var binding: FragmentButtonsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentButtonsBinding.inflate(inflater, container, false)
        binding.apply {
            btnDz14.setOnClickListener {
                parentFragmentManager.beginTransaction()
                    .replace(R.id.fragmentContainer, Dz14Fragment.newInstance()).commit()
            }
            return binding.root
        }

    }

    companion object {
        @JvmStatic
        fun newInstance() = ButtonsFragment()
    }
}
package com.example.tms

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.tms.databinding.FragmentButtonsBinding
import com.example.tms.dz14.Dz14Fragment
import com.example.tms.dz15.Dz15Fragment
import com.example.tms.dz16.Dz16Fragment

class ButtonsFragment : Fragment() {

    private lateinit var binding: FragmentButtonsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentButtonsBinding.inflate(inflater, container, false)
        binding.apply {
            someButton(btnDz14, Dz14Fragment.newInstance())
            someButton(btnDz15, Dz15Fragment.newInstance())
            someButton(btnDz16, Dz16Fragment.newInstance())
            return binding.root
        }
    }

    companion object {
        @JvmStatic
        fun newInstance() = ButtonsFragment()
    }

    private fun someButton(view: View, fragment: Fragment) {
        view.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainer, fragment)
                .addToBackStack("fragment")
                .commit()
        }
    }
}
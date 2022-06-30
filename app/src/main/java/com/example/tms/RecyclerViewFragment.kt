package com.example.tms

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.tms.databinding.FragmentButtonsBinding

class RecyclerViewFragment : Fragment() {
    private lateinit var binding: FragmentButtonsBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentButtonsBinding.inflate(inflater, container, false)
        val taskList = mutableListOf<DateModel>(
            DateModel("Dz14"),
            DateModel("Dz15"),
            DateModel("Dz16"),
        )
        val adapter = RecyclerViewAdapter(taskList)
        binding.recyclerView.adapter = adapter
        binding.recyclerView.layoutManager = LinearLayoutManager(context)
        return binding.root
    }
    companion object {
        @JvmStatic
        fun newInstance() = RecyclerViewFragment()
    }
}
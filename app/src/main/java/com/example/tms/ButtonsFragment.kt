package com.example.tms

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.tms.databinding.ActivityMainBinding
import com.example.tms.databinding.FragmentButtonsBinding
import com.example.tms.dz14.Dz14Fragment
import com.example.tms.dz15.Dz15Fragment
import com.example.tms.dz16.Dz16Fragment

class ButtonsFragment : Fragment(), RecyclerViewAdapter.ClickListener {
    private lateinit var binding: FragmentButtonsBinding
    private lateinit var adapter: RecyclerViewAdapter
    private val listData: List<DateModel> = ArrayList()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentButtonsBinding.inflate(inflater, container, false)
        binding.apply {
//            someButton(btnDz14, Dz14Fragment.newInstance())
//            someButton(btnDz15, Dz15Fragment.newInstance())
//            someButton(btnDz16, Dz16Fragment.newInstance())
            initRecyclerView(binding.recyclerView)
            return binding.root
        }
    }

    private fun initRecyclerView(view: View) {
        binding.recyclerView.layoutManager = LinearLayoutManager(activity)
        adapter = RecyclerViewAdapter(listData, this)
        binding.recyclerView.adapter = adapter
    }

    companion object {
        @JvmStatic
        fun newInstance() = ButtonsFragment()
    }

    private fun someButton(view: View, fragment: Fragment) {
        view.setOnClickListener {
            parentFragmentManager.beginTransaction().setCustomAnimations(
                R.anim.slide_in_left,
                R.anim.slide_out_left,
                R.anim.slide_in_right,
                R.anim.slide_out_right
            )
                .replace(R.id.fragmentContainer, fragment)
                .addToBackStack("fragment")
                .commit()
        }
    }

    override fun onItemClick(dateModel: DateModel) {
        TODO("Not yet implemented")
    }
}
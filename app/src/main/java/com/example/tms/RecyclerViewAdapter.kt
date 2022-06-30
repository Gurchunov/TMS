package com.example.tms

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.example.tms.databinding.ItemRecyclerviewBinding
import com.example.tms.dz14.Dz14Fragment
import com.example.tms.dz15.Dz15Fragment
import com.example.tms.dz16.Dz16Fragment

class RecyclerViewAdapter(private val listData: List<DateModel>) :
    RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val itemRecyclerviewBinding =
            ItemRecyclerviewBinding.inflate(inflater, parent, false)
        return MyViewHolder(itemRecyclerviewBinding)
    }

    override fun getItemCount(): Int = listData.size

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(listData[position])
        holder.itemView.setOnClickListener { v ->
            when (position) {
                0 -> {
                    openFragment(v, Dz14Fragment())
                }
                1 -> {
                    openFragment(v, Dz15Fragment())
                }
                2 -> {
                    openFragment(v, Dz16Fragment())
                }
            }
        }
    }

    private fun openFragment(v: View, frag: Fragment) {
        val activity = v.context as AppCompatActivity
        activity.supportFragmentManager.beginTransaction().setCustomAnimations(
            R.anim.slide_in_left,
            R.anim.slide_out_left,
            R.anim.slide_in_right,
            R.anim.slide_out_right
        )
            .replace(R.id.fragmentContainer, frag)
            .addToBackStack(null)
            .commit()
    }

    inner class MyViewHolder(private val binding: ItemRecyclerviewBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(data: DateModel) {
            binding.tvTitle.text = data.title
        }
    }
}

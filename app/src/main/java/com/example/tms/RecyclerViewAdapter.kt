package com.example.tms

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewAdapter(
    private val listData: List<DateModel>,
    private val clickListener: ClickListener
) :
    RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_recyclerview, parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listData.size
    }

    class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val titleTextView: TextView

        init {
            titleTextView = view.findViewById(R.id.tvTitle)
        }
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.titleTextView.text = listData[position].title
        holder.itemView.setOnClickListener {
            clickListener.onItemClick(listData[position])
        }
    }

    interface ClickListener {
        fun onItemClick(dateModel: DateModel)
    }
}
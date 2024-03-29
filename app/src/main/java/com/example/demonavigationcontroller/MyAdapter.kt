package com.example.demonavigationcontroller

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(private val range: Int) :
    RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val textView = inflater.inflate(R.layout.list_item, parent, false) as TextView
        return MyViewHolder(textView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(position)
    }

    override fun getItemCount() = range

    inner class MyViewHolder(private val textView: TextView) : RecyclerView.ViewHolder(textView) {
        fun bind(int: Int) {
            textView.text = itemView.context.getString(R.string.itemX, int)
        }
    }
}
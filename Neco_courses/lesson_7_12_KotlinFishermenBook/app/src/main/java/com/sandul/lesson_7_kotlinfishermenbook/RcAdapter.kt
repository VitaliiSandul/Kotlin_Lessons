package com.sandul.lesson_7_kotlinfishermenbook

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class RcAdapter (listArray: ArrayList<ListItem>, context: Context): RecyclerView.Adapter<RcAdapter.ViewHolder>(){

    var listArrayRc = listArray
    var contextRc = context

    class ViewHolder(view: View): RecyclerView.ViewHolder(view) {

        val tvTitle = view.findViewById<TextView>(R.id.tvTitle)
        val tvContext = view.findViewById<TextView>(R.id.tvContent)
        val ivFish = view.findViewById<ImageView>(R.id.ivFish)

        fun bind(listItem: ListItem, context: Context){
            tvTitle.text = listItem.titleText
            tvContext.text = listItem.contentText
            ivFish.setImageResource(listItem.image_id)

            itemView.setOnClickListener(){
                Toast.makeText(context, "Pressed: ${tvTitle.text}", Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(contextRc)
        return ViewHolder(inflater.inflate(R.layout.item_layout, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var listItem = listArrayRc.get(position)
        holder.bind(listItem, contextRc)
    }

    override fun getItemCount(): Int {
        return listArrayRc.size
    }

    fun updateAdapter(listArray: List<ListItem>){
        listArrayRc.clear()
        listArrayRc.addAll(listArray)
        notifyDataSetChanged()
    }
}
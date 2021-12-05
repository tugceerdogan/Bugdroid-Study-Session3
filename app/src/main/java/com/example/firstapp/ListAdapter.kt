package com.example.firstapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class ListAdapter(private val mList: List<Items>) :
    RecyclerView.Adapter<ListAdapter.ItemViewHolder>() {

    // holds the views for adding it to text
    class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textViewItem: TextView = itemView.findViewById(R.id.textViewItem)
    }

    // initializes the ViewHolder when the Adapter is created
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_list, parent, false)

        return ItemViewHolder(view)
    }

    //  it performs the binding of the data returned from onCreateViewHolder
    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {

        val itemsList = mList[position]

        // sets the text to the textview from our itemHolder class
        holder.textViewItem.text = itemsList.item

    }

    // return the number of the items in the list
    override fun getItemCount(): Int {
        return mList.size
    }

}


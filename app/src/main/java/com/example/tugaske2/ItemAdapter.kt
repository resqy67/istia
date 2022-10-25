package com.example.tugaske2

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ItemAdapter(val context: Context, val models: ArrayList<DataModel>): RecyclerView.Adapter<ItemViewHolder>(){
    var OnItemClick: ((DataModel) -> Unit)? = null

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ItemViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.custom_list, parent, false)

        return ItemViewHolder(view)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val datax = models[position]
        holder.bindItems(context, datax)
        //holder.items(context, data[position])
        holder.itemView.setOnClickListener{
            OnItemClick?.invoke(datax)
        }
    }

    override fun getItemCount(): Int {
        return models.size
    }
}





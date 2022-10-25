package com.example.tugaske2

import android.content.Context
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class ItemViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
    fun bindItems(context: Context, model: DataModel) {
        val viewImg = itemView.findViewById<ImageView>(R.id.img)
        val txtTitle = itemView.findViewById<TextView>(R.id.txt_title)
        val txtDesc = itemView.findViewById<TextView>(R.id.txt_Desc)

        viewImg.setImageResource(model.imgView)
        txtTitle.text = model.txtTitle
        txtDesc.text = model.txtDesc
    }
}
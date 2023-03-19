package com.example.kostrecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import org.w3c.dom.Text

class ListKostAdapter(private val listKost: ArrayList<Kost>) : RecyclerView.Adapter<ListKostAdapter.ListViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_row_kost, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val (name, place, price, description, photo) = listKost[position]
        holder.imgPhoto.setImageResource(photo)
        holder.tvName.text = name
        holder.tvPlace.text = place
        holder.tvPrice.text = price
        holder.tvDescription.text = description
    }

    override fun getItemCount(): Int = listKost.size

    class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
        val tvName: TextView = itemView.findViewById(R.id.tv_kost_name)
        val tvPlace: TextView = itemView.findViewById(R.id.tv_kost_place)
        val tvPrice: TextView = itemView.findViewById(R.id.tv_kost_price)
        val tvDescription: TextView = itemView.findViewById(R.id.tv_kost_description)
    }
}
package com.example.kostrecyclerview

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import org.w3c.dom.Text

class ListKostAdapter(private val listKost: ArrayList<Kost>) : RecyclerView.Adapter<ListKostAdapter.ListViewHolder>() {

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvName: TextView = itemView.findViewById(R.id.tv_kost_name)
        val tvPlace: TextView = itemView.findViewById(R.id.tv_kost_place)
        val tvPrice: TextView = itemView.findViewById(R.id.tv_kost_price)
        val tvDescription: TextView = itemView.findViewById(R.id.tv_kost_description)
        val imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)

        fun bind(kost: Kost) {
            tvName.text = kost.name
            tvPlace.text = kost.place
            tvPrice.text = kost.price
            tvDescription.text = kost.description
            imgPhoto.setImageResource(kost.photo)
            itemView.setOnClickListener {
                val intent = Intent(itemView.context, KostDetail::class.java)
                intent.putExtra(KostDetail.KEY_KOST, kost)
                itemView.context.startActivity(intent)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_row_kost, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val kost = listKost[position]

        Glide.with(holder.itemView.context)
            .load(kost.photo)
            .apply(RequestOptions().override(100, 100))
            .into(holder.imgPhoto)

//        val (name, place, price, description, photo) = listKost[position]
        holder.tvName.text = kost.name
        holder.tvPlace.text = kost.place
        holder.tvPrice.text = kost.price
        holder.tvDescription.text = kost.description

        holder.bind(listKost[position])
    }

    override fun getItemCount(): Int = listKost.size


}
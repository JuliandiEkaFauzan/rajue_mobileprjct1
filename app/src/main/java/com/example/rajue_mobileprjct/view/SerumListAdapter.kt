package com.example.rajue_mobileprjct.view

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.rajue_mobileprjct.R
import com.example.rajue_mobileprjct.model.Photo
import com.example.rajue_mobileprjct.toner
import kotlinx.android.synthetic.main.serum_list.view.descripsi1
import kotlinx.android.synthetic.main.serum_list.view.foto
import kotlinx.android.synthetic.main.serum_list.view.titleproduk1

class SerumListAdapter (var photos: ArrayList<Photo>) :
    RecyclerView.Adapter<SerumListAdapter.ViewHolder>(){
    fun updatePhotos(newPhotos: List<Photo>){
        photos.clear()
        photos.addAll(newPhotos)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, p1: Int)
    = ViewHolder(
        LayoutInflater.from(parent.context)
            .inflate(R.layout.serum_list,parent,false)
    )
    override fun getItemCount() = photos.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int){

        holder.bind(photos[position])
    }
    class  ViewHolder(view: View) : RecyclerView.ViewHolder(view){
        fun bind(photos: Photo) {

            val arah :ImageView =itemView.foto
            itemView.titleproduk1.text = photos.title
            itemView.descripsi1.text = photos.detail
            itemView.setOnClickListener {
                val intent = Intent(itemView.context, toner::class.java)
                intent.putExtra("judul",photos.title)
                intent.putExtra("detail",photos.detail)
                intent.putExtra("gambar",photos.thumbnail)
                itemView.context.startActivity(intent)
            }

            val urGambar=photos.thumbnail
            Glide.with(itemView.context)
                .load("$urGambar")
                .into(arah)

            val arah2 :ImageView =itemView.foto
            itemView.titleproduk1.text = photos.title
            itemView.descripsi1.text = photos.detail
            itemView.setOnClickListener {
                val intent = Intent(itemView.context, toner::class.java)
                intent.putExtra("judul",photos.title)
                intent.putExtra("detail",photos.detail)
                intent.putExtra("gambar",photos.thumbnail)
                itemView.context.startActivity(intent)
            }

            val urGambar1=photos.thumbnail
            Glide.with(itemView.context)
                .load("$urGambar.png")
                .into(arah)
//            Glide.with(itemView.context)
        //            .load(photos.thumbnail).into(itemView.imageView)






        }
    }
}
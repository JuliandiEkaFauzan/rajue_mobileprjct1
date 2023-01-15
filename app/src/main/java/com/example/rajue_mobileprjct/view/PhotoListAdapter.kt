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
import kotlinx.android.synthetic.main.toner_list.view.descripsi1
import kotlinx.android.synthetic.main.toner_list.view.foto
import kotlinx.android.synthetic.main.toner_list.view.titleproduk1

class PhotoListAdapter (var photos: ArrayList<Photo>) :
    RecyclerView.Adapter<PhotoListAdapter.ViewHolder>(){
    fun updatePhotos(newPhotos: List<Photo>){
        photos.clear()
        photos.addAll(newPhotos)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, p1: Int)
    = ViewHolder(
        LayoutInflater.from(parent.context)
            .inflate(R.layout.toner_list,parent,false)
    )
    override fun getItemCount() = photos.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int){

        holder.bind(photos[position])
    }
    class  ViewHolder(view: View) : RecyclerView.ViewHolder(view){
        fun bind(photos: Photo) {

            val arah :ImageView =itemView.foto
            itemView.titleproduk1.text = photos.titletoner
            itemView.descripsi1.text = photos.detailtoner
            itemView.setOnClickListener {
                val intent = Intent(itemView.context, toner::class.java)
                intent.putExtra("judul",photos.titletoner)
                intent.putExtra("detail",photos.detailtoner)
                intent.putExtra("gambar",photos.thumbnailtoner)
                itemView.context.startActivity(intent)
            }

            val urGambar=photos.thumbnailtoner
            Glide.with(itemView.context)
                .load("$urGambar")
                .into(arah)

            val arah2 :ImageView =itemView.foto
            itemView.titleproduk1.text = photos.titletoner
            itemView.descripsi1.text = photos.detailtoner
            itemView.setOnClickListener {
                val intent = Intent(itemView.context, toner::class.java)
                intent.putExtra("judul",photos.titletoner)
                intent.putExtra("detail",photos.detailtoner)
                intent.putExtra("gambar",photos.thumbnailtoner)
                itemView.context.startActivity(intent)
            }

            val urGambar1=photos.thumbnailtoner
            Glide.with(itemView.context)
                .load("$urGambar.png")
                .into(arah)
//            Glide.with(itemView.context)
        //            .load(photos.thumbnail).into(itemView.imageView)






        }
    }
}
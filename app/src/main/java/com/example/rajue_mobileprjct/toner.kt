package com.example.rajue_mobileprjct

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.example.rajue_mobileprjct.view.PhotoListAdapter
import com.example.rajue_mobileprjct.viewmodel.ListViewModel
import kotlinx.android.synthetic.main.toner.*

class toner : AppCompatActivity() {

    lateinit var viewModel: ListViewModel
    private val photoListAdapter = PhotoListAdapter(arrayListOf())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.toner)
        titleproduk1.text =intent.getStringExtra("judul")
        descripsi1.text =intent.getStringExtra("detail")


        Glide.with(this)
            .load(intent.getStringExtra("gambar"))
            .into( foto )



    }

    }

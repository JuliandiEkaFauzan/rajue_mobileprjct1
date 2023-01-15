package com.example.rajue_mobileprjct.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.rajue_mobileprjct.R
import com.example.rajue_mobileprjct.viewmodel.ListViewModel
import kotlinx.android.synthetic.main.toner_main.*

class MainActivity : AppCompatActivity() {

    lateinit var viewModel: ListViewModel
    private val photoListAdapter = PhotoListAdapter(arrayListOf())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.toner_main)

        viewModel = ViewModelProvider(this)
            .get(ListViewModel::class.java)
        viewModel.fetchData()

        rv_list.apply {

            layoutManager = LinearLayoutManager(context)
            adapter = photoListAdapter
        }
        observeViewModel()
    }
    fun observeViewModel() {
        viewModel.photos.observe(this, Observer { photos ->
            photos?.let {
                photoListAdapter.updatePhotos(it)
            }
        })
    }
}
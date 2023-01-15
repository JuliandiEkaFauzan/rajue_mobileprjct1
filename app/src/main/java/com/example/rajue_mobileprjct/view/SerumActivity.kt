package com.example.rajue_mobileprjct.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.rajue_mobileprjct.R
import com.example.rajue_mobileprjct.viewmodel.ListViewModel
import kotlinx.android.synthetic.main.toner_main.*

class SerumActivity : AppCompatActivity() {

    lateinit var viewModel: ListViewModel
    private val serumListAdapter = SerumListAdapter(arrayListOf())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.serum_main)

        viewModel = ViewModelProvider(this)
            .get(ListViewModel::class.java)
        viewModel.fetchData()

        rv_list.apply {

            layoutManager = LinearLayoutManager(context)
            adapter = serumListAdapter
        }
        observeViewModel()
    }
    fun observeViewModel() {
        viewModel.photos.observe(this, Observer { photos ->
            photos?.let {
                serumListAdapter.updatePhotos(it)
            }
        })
    }
}
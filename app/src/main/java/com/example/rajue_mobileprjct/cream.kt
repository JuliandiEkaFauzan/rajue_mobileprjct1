package com.example.rajue_mobileprjct

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class cream : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.cream)
    }
    fun info2(view: View?) {
        val i = Intent(applicationContext, creamActivity::class.java)
        startActivity(i)

    }
}
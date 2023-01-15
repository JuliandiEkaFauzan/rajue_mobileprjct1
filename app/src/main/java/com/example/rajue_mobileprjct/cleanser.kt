package com.example.rajue_mobileprjct

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class cleanser : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.cleanser)
    }
    fun masuk(view: View?) {
        val i = Intent(applicationContext, cleanserActivity::class.java)
        startActivity(i)

    }
}
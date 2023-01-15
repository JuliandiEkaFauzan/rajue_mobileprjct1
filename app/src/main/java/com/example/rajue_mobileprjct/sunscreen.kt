package com.example.rajue_mobileprjct

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class sunscreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sunscreen)
    }
    fun info2(view: View?) {
        val i = Intent(applicationContext, sunscreenActivity::class.java)
        startActivity(i)

    }
}
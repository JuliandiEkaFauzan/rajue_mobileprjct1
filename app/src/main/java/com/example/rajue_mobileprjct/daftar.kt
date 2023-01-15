package com.example.rajue_mobileprjct

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class daftar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_daftar)
    }
    fun login(view: View?) {
        val i = Intent(applicationContext, login::class.java)
        startActivity(i)

    }
    fun masuk(view: View?) {
        val i = Intent(applicationContext, login::class.java)
        startActivity(i)

    }
}
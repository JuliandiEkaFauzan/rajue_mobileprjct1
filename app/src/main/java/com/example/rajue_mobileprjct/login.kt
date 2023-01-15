package com.example.rajue_mobileprjct

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }
    fun daftar(view: View?) {
        val i = Intent(applicationContext, daftar::class.java)
        startActivity(i)

    }
    fun halaman1(view: View?) {
        val i = Intent(applicationContext, halaman1::class.java)
        startActivity(i)

    }
}
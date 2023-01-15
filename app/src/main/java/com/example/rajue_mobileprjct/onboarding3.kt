package com.example.rajue_mobileprjct

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class onboarding3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding3)
    }
    fun login(view: View?) {
        val i = Intent(applicationContext, login::class.java)
        startActivity(i)

    }
}
package com.example.rajue_mobileprjct

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class onboarding2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding2)
    }
    fun onboarding3(view: View?) {
        val i = Intent(applicationContext, onboarding3::class.java)
        startActivity(i)

    }
}
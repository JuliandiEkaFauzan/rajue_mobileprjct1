package com.example.rajue_mobileprjct

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.rajue_mobileprjct.view.MainActivity
import com.example.rajue_mobileprjct.view.SerumActivity

class halaman1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_halaman1)
    }
    fun about(view: View?) {
        val i = Intent(applicationContext, about::class.java)
        startActivity(i)

    }
    fun search(view: View?) {
        val i = Intent(applicationContext, pencarian::class.java)
        startActivity(i)

    }
    fun perantara(view: View?) {
        val i = Intent(applicationContext, MainActivity::class.java)
        startActivity(i)

    }
    fun perantara2(view: View?) {
        val i = Intent(applicationContext, SerumActivity::class.java)
        startActivity(i)

    }
    fun arahan(view: View?) {
        val i = Intent(applicationContext, cleanser::class.java)
        startActivity(i)

    }
    fun arahan2(view: View?) {
        val i = Intent(applicationContext, sunscreen::class.java)
        startActivity(i)

    }
    fun arahan3(view: View?) {
        val i = Intent(applicationContext, mask::class.java)
        startActivity(i)

    }
    fun arahan4(view: View?) {
        val i = Intent(applicationContext, cream::class.java)
        startActivity(i)

    }
    fun profile(view: View?) {
        val i = Intent(applicationContext, profile::class.java)
        startActivity(i)

    }

}
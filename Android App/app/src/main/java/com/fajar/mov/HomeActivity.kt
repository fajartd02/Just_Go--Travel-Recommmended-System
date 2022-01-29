package com.fajar.mov

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        var ticket = findViewById<ImageView>(R.id.tiket_menu)

        ticket.setOnClickListener {
            startActivity(Intent(this@HomeActivity, ItineraryActivity::class.java))
        }

    }
}
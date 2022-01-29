package com.fajar.mov

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ItineraryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_itinerary)

        var button = findViewById<Button>(R.id.button4)

        button.setOnClickListener {
            startActivity(Intent(this@ItineraryActivity, ResultActivity::class.java))
        }
    }
}
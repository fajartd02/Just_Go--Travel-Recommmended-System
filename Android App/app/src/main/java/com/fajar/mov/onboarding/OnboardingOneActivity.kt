package com.fajar.mov.onboarding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.fajar.mov.R
import com.fajar.mov.sign.SignInActivity

class OnboardingOneActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding_one)

        val btn_primary = findViewById<Button>(R.id.btn_primary)
        val btn_secondary = findViewById<Button>(R.id.btn_secondary)

        btn_primary.setOnClickListener {
            var intent = Intent(this@OnboardingOneActivity, OnboardingTwoActivity::class.java)
            startActivity(intent)
        }

        btn_secondary.setOnClickListener {
            finishAffinity() // supaya ga bisa ke back, saat back langsung out aplikasi
            var intent = Intent(this@OnboardingOneActivity, SignInActivity::class.java)
            startActivity(intent)
        }
    }
}
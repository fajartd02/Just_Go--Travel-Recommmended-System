package com.fajar.mov.onboarding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.fajar.mov.R
import com.fajar.mov.sign.SignInActivity

class OnboardingTwoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding_two)

        val btn_primary = findViewById<Button>(R.id.btn_primary)
        val btn_secondary = findViewById<Button>(R.id.btn_secondary)

        btn_primary.setOnClickListener {
            finishAffinity()
            startActivity(Intent(this@OnboardingTwoActivity, OnboardingThreeActivity::class.java))
        }

        btn_secondary.setOnClickListener {
            finishAffinity()
            var intent = Intent(this@OnboardingTwoActivity, SignInActivity::class.java)
            startActivity(intent)
        }


    }
}
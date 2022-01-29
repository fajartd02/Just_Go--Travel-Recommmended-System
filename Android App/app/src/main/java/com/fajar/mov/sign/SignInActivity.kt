package com.fajar.mov.sign

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.fajar.mov.HomeActivity
import com.fajar.mov.R
import com.fajar.mov.onboarding.OnboardingThreeActivity
import com.google.firebase.database.DatabaseReference

import com.google.firebase.database.FirebaseDatabase


class SignInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)


//        val button_sign = findViewById<Button>(R.id.button_sign)
//        button_sign.setOnClickListener {
//            // Write a message to the database
//            // Write a message to the database
//            val database = FirebaseDatabase.getInstance()
//            val myRef = database.getReference("message")
//
//            myRef.setValue("Hello, World!")
        val btn_primary = findViewById<Button>(R.id.btn_primary)
        val btn_secondary = findViewById<Button>(R.id.btn_secondary)

        btn_primary.setOnClickListener {
            finishAffinity()
            startActivity(Intent(this@SignInActivity, HomeActivity::class.java))
        }

        btn_secondary.setOnClickListener {
            startActivity(Intent(this@SignInActivity, SignUpActivity::class.java))
        }



//        }
    }
}
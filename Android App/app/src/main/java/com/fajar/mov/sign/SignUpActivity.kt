package com.fajar.mov.sign

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.fajar.mov.HomeActivity
import com.fajar.mov.R

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        var button = findViewById<Button>(R.id.button4)

        button.setOnClickListener {
            startActivity(Intent(this@SignUpActivity, SignUpPhotoscreenActivity::class.java))
        }
    }
}
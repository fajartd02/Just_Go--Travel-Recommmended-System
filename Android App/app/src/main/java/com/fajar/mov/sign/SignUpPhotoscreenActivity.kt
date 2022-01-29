package com.fajar.mov.sign

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.fajar.mov.HomeActivity
import com.fajar.mov.R

class SignUpPhotoscreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up_photoscreen)

        var btn_lanjutkan = findViewById<Button>(R.id.button4)

        btn_lanjutkan.setOnClickListener {
            finishAffinity()
            startActivity(Intent(this@SignUpPhotoscreenActivity, HomeActivity::class.java))
        }
    }
}
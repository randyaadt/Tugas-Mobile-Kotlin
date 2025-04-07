package com.example.pm25_assign3

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class LandingPage : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.page_landing)

        val tvWelcomeMessage = findViewById<TextView>(R.id.tvWelcomeMessage)
        val userName = intent.getStringExtra("USER_NAME")

        tvWelcomeMessage.text = "Welcomee, $userName!"
    }
}

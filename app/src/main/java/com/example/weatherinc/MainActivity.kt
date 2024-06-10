package com.example.weatherinc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // declaring variable
        val weatherButton = findViewById<Button>(R.id.weatherButton)
        weatherButton.setOnClickListener {
            val intent = Intent(this, screen2::class.java)
            startActivity(intent)
        }

    }
}
package com.example.weatherinc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class screen3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen3)
        val temperatures = intent.getIntArrayExtra("temperatures") ?: intArrayOf()

        val detailTextView = findViewById<TextView>(R.id.textViewDetails)
        val details = StringBuilder()
        for (i in temperatures.indices) {
            details.append("Day ${i + 1}: ${temperatures[i]}°C\n")
        }
        detailTextView.text = details.toString()

        findViewById<Button>(R.id.buttonBack).setOnClickListener {
            finish()
        }
    }
}
package com.example.weatherinc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class screen2 : AppCompatActivity() {

    data class WeatherData(
        val day: String,
        val minTemp: Int,
        val maxTemp: Int,
        val condition: String
    )
    private lateinit var weatherData: Array<WeatherData>

    private val temperatures = IntArray(7) { 0 }
    private lateinit var editTexts: Array<EditText>
    private lateinit var averageTextView: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen2)


        editTexts = arrayOf(
            findViewById(R.id.editTextDay1),
            findViewById(R.id.editTextDay2),
            findViewById(R.id.editTextDay3),
            findViewById(R.id.editTextDay4),
            findViewById(R.id.editTextDay5),
            findViewById(R.id.editTextDay6),
            findViewById(R.id.editTextDay7)
        )
        averageTextView = findViewById(R.id.textViewAverage)

        weatherData = arrayOf(
            WeatherData("Monday", 12, 25, "Sunny"),
            WeatherData("Tuesday", 15, 29, "Sunny"),
            WeatherData("Wednesday", 18, 30, "Cloudy"),
            WeatherData("Thursday", 16, 28, "Partly Cloudy"),
            WeatherData("Friday", 20, 32, "Sunny"),
            WeatherData("Saturday", 10, 18, "Raining"),
            WeatherData("Sunday", 10, 16, "Cold")
        )

        findViewById<Button>(R.id.buttonCalculate).setOnClickListener {
            if (collectData()) {
                calculateAndDisplayAverage()
            }
        }

        findViewById<Button>(R.id.buttonDetails).setOnClickListener {
            val intent = Intent(this, screen3::class.java)
            intent.putExtra("temperatures", temperatures)
            startActivity(intent)
        }

        findViewById<Button>(R.id.buttonClear).setOnClickListener {
            clearData()
        }

        findViewById<Button>(R.id.buttonExit).setOnClickListener {
            finish()
        }
    }

    private fun collectData(): Boolean {
        for (i in temperatures.indices) {
            val temp = editTexts[i].text.toString()
            if (temp.isEmpty()) {
                Toast.makeText(this, "Please fill all fields", Toast.LENGTH_SHORT).show()
                return false
            }
            temperatures[i] = temp.toInt()
        }
        return true
    }

    private fun calculateAndDisplayAverage() {
        val sum = temperatures.sum()
        val average = sum / temperatures.size
        averageTextView.text = "Average Temperature: $average"
    }

    private fun clearData() {
        for (editText in editTexts) {
            editText.text.clear()
        }
        averageTextView.text = ""
    }
}

private fun Intent.putParcelableArrayListExtra(s: String, arrayList: ArrayList<screen2.WeatherData>) {

}

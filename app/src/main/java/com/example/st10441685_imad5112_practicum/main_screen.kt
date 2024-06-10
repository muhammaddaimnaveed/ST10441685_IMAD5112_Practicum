package com.example.st10441685_imad5112_practicum

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class main_screen : AppCompatActivity() {

    // This code stores the user inputs.

    private var dayStorage: ArrayList<String> = ArrayList()
    private var minTemperatureStorage: ArrayList<String> = ArrayList()
    private var maxTemperatureStorage: ArrayList<String> = ArrayList()
    private var weatherConditionStorage: ArrayList<String> = ArrayList()


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main_screen)

        val dayEditText = findViewById<EditText>(R.id.dayEditText)
        val minEditText = findViewById<EditText>(R.id.minEditText)
        val maxEditText = findViewById<EditText>(R.id.maxEditText)
        val exitButton2 = findViewById<Button>(R.id.exitButton2)
        val saveButton = findViewById<Button>(R.id.saveButton)
        val detailButton = findViewById<Button>(R.id.detailButton)
        val textView2 = findViewById<TextView>(R.id.textView2)
        val weatherconditionEditText = findViewById<EditText>(R.id.weatherconditionEditText)

        // Assigning the variables to store the user input.

        
        saveButton.setOnClickListener {

            val day = dayEditText.text.toString()
            val minTemp = minEditText.text.toString()
            val maxTemp = maxEditText.text.toString()
            val weathercondition = weatherconditionEditText.text.toString()


            // This code adds the user input into the variables.

            if (day.isNotEmpty() || minTemp.isNotEmpty() || maxTemp.isNotEmpty() || weathercondition.isNotEmpty())

                dayStorage.add(day)
            minTemperatureStorage.add(minTemp)
            maxTemperatureStorage.add(maxTemp)
            weatherConditionStorage.add(weathercondition)

            // This code displayes the user input in the Text View box

            val lastInput = "Day :$day\nMin Temp: $minTemp\nMax Temp: $maxTemp\nWeather Condition: $weathercondition"

            // This code clears the Edit Text boxes when the Save Button is clicked.

            textView2.text = lastInput
            dayEditText.text.clear()
            minEditText.text.clear()
            maxEditText.text.clear()
            weatherconditionEditText.text.clear()
            Toast.makeText(this, "Saved",Toast.LENGTH_SHORT).show()
        }

        // This code takes the user and transfers the stored user input to the next activity.

        detailButton.setOnClickListener {

            val intent = Intent(this, detail_screen ::class.java).apply {

                putStringArrayListExtra("dayStorage", ArrayList(dayStorage))
                putStringArrayListExtra("minTempretureStorage", ArrayList(minTemperatureStorage))
                putStringArrayListExtra("maxTempretureStorage", ArrayList(maxTemperatureStorage))
                putStringArrayListExtra("dayStorage", ArrayList(weatherConditionStorage)) }

            startActivity(intent) }

        // This code exits the application.

        exitButton2.setOnClickListener {

            finishAffinity() }
    }


}

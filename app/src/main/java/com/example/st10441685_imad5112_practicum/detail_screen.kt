package com.example.st10441685_imad5112_practicum

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class detail_screen : AppCompatActivity() {

    private var dateStorage: ArrayList<String> = ArrayList()
    private var mstStorage: ArrayList<String> = ArrayList()
    private var astStorage: ArrayList<String> = ArrayList()
    private var notesStorage: ArrayList<String> = ArrayList()

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.table_layout)

        // Declaring the variables

        val dayTextView = findViewById<TextView>(R.id.dayTextView)
        val minTextView = findViewById<TextView>(R.id.minTextView)
        val maxTextView = findViewById<TextView>(R.id.maxTextView)
        val wcTextView = findViewById<TextView>(R.id.wcTextView)
        val backbutton = findViewById<Button>(R.id.backbutton )

        // This code recieves the stores information  and disays it in the table.

        val dayStorage = intent.getStringArrayExtra("dayStorage")
        dayStorage?.let{dayTextView.text=it.joinToString { "\n\n" }}

        val minTemperatureStorage = intent.getStringArrayExtra("minTemperatureStorage")
        minTemperatureStorage?.let{minTextView.text=it.joinToString { "\n\n" }}


        val maxTemperatureStorage= intent.getStringArrayExtra("maxTemperatureStorage")
        dayStorage?.let{maxTextView.text=it.joinToString { "\n\n" }}


        val weatherConditionStorage = intent.getStringArrayExtra("dayStorage")
        dayStorage?.let{wcTextView.text=it.joinToString { "\n\n" }}


        backbutton.setOnClickListener {
            val intent = Intent(this, main_screen::class.java)
            startActivity(intent) }





    }
}

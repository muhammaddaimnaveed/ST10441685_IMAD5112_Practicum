package com.example.st10441685_imad5112_practicum

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        val nextButton = findViewById<Button>(R.id.nextButton)
        val exitButton = findViewById<Button>(R.id.exitButton)



        // This code takes the user to the Main Screen.

        nextButton.setOnClickListener {
            val intent = Intent(this, main_screen::class.java)
            startActivity(intent) }


        // This code is used to exit the application.

        exitButton.setOnClickListener {
            finishAffinity() }
    }
}

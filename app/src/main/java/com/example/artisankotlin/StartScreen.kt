package com.example.artisankotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.content.Intent

class StartScreen : AppCompatActivity() {

    private lateinit var startButton: ImageButton

      override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start_screen)

          startButton = findViewById(R.id.startButton)
          startButton.setOnClickListener { val intent = Intent(this@StartScreen, MainActivity::class.java)
              startActivity(intent) }
    }

}
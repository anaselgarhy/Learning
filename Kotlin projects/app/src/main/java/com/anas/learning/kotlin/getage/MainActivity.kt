package com.anas.learning.kotlin.getage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // Set the layout for the activity

        // Get the views from the layout by ID
        // val is used to create a constant variable
        val yearOfBerthEditText = findViewById<EditText>(R.id.yearOfBerthEditText)
        val ageTextView = findViewById<TextView>(R.id.ageTextView)
        val calculateButton = findViewById<Button>(R.id.cluclateButton)

        calculateButton.setOnClickListener {
            val yOfb = yearOfBerthEditText.editableText.toString()
            val age = 2022 - yOfb.toInt()
            ageTextView.text = age.toString()
        }
    }
}
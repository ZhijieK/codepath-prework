package com.example.helloworld

import android.content.res.ColorStateList
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout


// This Kotlin file is where we're going to be handling user interaction
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Show this layout file: activity_main
        setContentView(R.layout.activity_main)

        // Button Interactions
        // 1. Get a reference to button (change text color)
        findViewById<Button>(R.id.button).setOnClickListener {
            // Tests button functionality
            Log.i("Zhijie", "Tapped on button")
            // Change the color of the text
            // Get a reference to the text view
            findViewById<TextView>(R.id.textView).setTextColor(getResources().getColor(R.color.black))
            // Changes the text color in edittext as well
            findViewById<EditText>(R.id.et_simple).setTextColor(getResources().getColor(R.color.black))

        }
        // 2. Get a reference to button (change view color)
        findViewById<Button>(R.id.button2).setOnClickListener {
            // Change the color of the background
            // Get a reference to the background view
            findViewById<ConstraintLayout>(R.id.backgroundView).setBackgroundColor(
                getResources().getColor(
                    androidx.appcompat.R.color.material_grey_300
                )
            )
        }
        // 3. Get a reference to button (change text string)
        findViewById<Button>(R.id.button3).setOnClickListener {
            // Get a reference to the EditText
            val inputText:EditText=findViewById(R.id.et_simple)
            val showTxt = inputText.text.toString()
            findViewById<TextView>(R.id.textView).text = showTxt
        }
    }
}
package com.example.helloworld

import android.content.res.ColorStateList
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.inputmethod.EditorInfo
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
        //Variables
        val displayTxt = findViewById<TextView>(R.id.textView)
        val accessBG = findViewById<ConstraintLayout>(R.id.backgroundView)
        // Button Interactions
        // 1. Get a reference to button (change text color)
        findViewById<Button>(R.id.button).setOnClickListener {
            // Tests button functionality
            Log.i("Zhijie", "Tapped on button")
            // Change the color of the text
            // Get a reference to the text view
            displayTxt.setTextColor(getResources().getColor(R.color.black))
            // Changes the text color in edittext as well
            findViewById<EditText>(R.id.et_simple).setTextColor(getResources().getColor(R.color.black))

        }
        // 2. Get a reference to button (change view color)
        findViewById<Button>(R.id.button2).setOnClickListener {
            // Change the color of the background
            // Get a reference to the background view
            accessBG.setBackgroundColor(
                getResources().getColor(
                    androidx.appcompat.R.color.material_grey_300
                )
            )
        }
        // 3. Get a reference to button (change text string)
        findViewById<Button>(R.id.button3).setOnClickListener {
            // Get a reference to the EditText
            val inputText:EditText=findViewById(R.id.et_simple)
            var showTxt = inputText.text.toString()
            if (showTxt == ""){
                showTxt = "Hello from Zhijie"
            }
            displayTxt.text = showTxt
            //Closes keyboard
            inputText.onEditorAction(EditorInfo.IME_ACTION_DONE)
        }
        // 4. Get a reference to button (change text to goodbye)
        findViewById<Button>(R.id.button4).setOnClickListener {
            displayTxt.text = "Goodbye \uD83D\uDC4B"
        }
        // 5. Get a reference to button (reset all to default)
        findViewById<Button>(R.id.button5).setOnClickListener {
            displayTxt.text = "Hello from Zhijie"
            displayTxt.setTextColor(getResources().getColor(R.color.white))
            accessBG.setBackgroundColor(getResources().getColor(androidx.cardview.R.color.cardview_dark_background))
            findViewById<EditText>(R.id.et_simple).setTextColor(getResources().getColor(R.color.white))
        }
    }
}
package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        result_text.text = "Dice Rolled!"
        roll_button.setOnClickListener { rollDice() }
    }

    private fun rollDice() {
        val randomInt = (1..6).random()

        result_text.text = randomInt.toString()
        Toast.makeText(this, "Random number : $randomInt", Toast.LENGTH_SHORT).show()
    }
}
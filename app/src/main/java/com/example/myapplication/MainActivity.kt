package com.example.myapplication

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.textView)
        val pop = "Hello World!"
        // turn a text in to uppercase
        textView.text = pop.uppercase()
        // accumulating a value
        var birthday = 4
        birthday += 10
        birthday *= 3
        birthday -= 5
        birthday /= 2
        // displaying the value with a log
        Log.d("final answer", "answer $birthday")
        val result = findViewById<TextView>(R.id.result)
        result.text = birthday.toString()
        // creating a list of items to use into the spinner
        val items = listOf(
            "Choose an option",
            "Water",
            "Fire",
            "Earth",
            "Air"
        )
        // creating the adapter variable that will be used to populate the spinner
        val adapter = ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line,
            items)
        // declaring the spinner variable
        val spinDown = findViewById<Spinner>(R.id.spinDown)
        // setting the adapter to the spinner
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinDown.adapter = adapter








        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
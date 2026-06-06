package com.example.myapplication

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
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

        var birthday = 4
        birthday += 10
        birthday *= 3
        birthday -= 5
        birthday /= 2
        Log.d("final answer", "answer $birthday")
        val result = findViewById<TextView>(R.id.result)
        result.text = birthday.toString()
        val dropDown = findViewById<AutoCompleteTextView>(R.id.dropDown)
        val items = listOf<String>(
            "Water",
            "Fire",
            "Earth",
            "Air"
        )
        val adapter = ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line,
            items)

        dropDown.setAdapter(adapter)
        val spinDown = findViewById<Spinner>(R.id.spinDown)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinDown.adapter = adapter








        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
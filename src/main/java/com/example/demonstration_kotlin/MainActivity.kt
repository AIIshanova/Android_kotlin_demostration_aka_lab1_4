package com.example.demonstration_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn: Button
        val txt : TextView
        btn = findViewById(R.id.button_start)
        txt = findViewById(R.id.text_start)
        btn.setOnClickListener {
            txt.setText("I guess I have to submit")
        }
    }
}
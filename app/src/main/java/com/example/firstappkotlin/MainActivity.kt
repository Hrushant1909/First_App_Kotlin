package com.example.firstappkotlin

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    @SuppressLint("ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val coolbutton = findViewById<Button>(R.id.btnCool)
        val hotbutton = findViewById<Button>(R.id.btnHot)
        val linearLayout = findViewById<LinearLayout>(R.id.linlay)

        coolbutton.setOnClickListener {
            linearLayout.setBackgroundColor(R.color.blue)
        }

        hotbutton.setOnClickListener {
            linearLayout.setBackgroundColor(R.color.red)
        }
//Hello this is my first project and i am doing first changes and committing
        }
    }

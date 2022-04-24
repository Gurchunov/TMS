package com.example.tms

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        randomNumber(24)
    }

    private fun randomNumber(x: Int) {
        val range = 25..100
        if (x in 6..154) {
            if (x in range) {
                println("число $x попадает в искомый интервал")
            } else {
                println("число $x непопадает в искомый интервал")
            }
        }
    }
    }
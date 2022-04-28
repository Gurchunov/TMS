package com.example.tms

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        max(1, 2, 3)
    }

    private fun max(a: Int, b: Int, c: Int) {
        val plus = a + b + c
        val multiplay = a * b * c
        when {
            plus == multiplay -> println("значения равны")
            plus > multiplay -> println("$plus > $multiplay")
            plus < multiplay -> println("$plus < $multiplay")
        }
    }
}
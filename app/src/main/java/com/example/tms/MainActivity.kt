package com.example.tms

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        isEvenA(3)
    }
    private fun isEvenA(a: Int) {
        val b = 5
        when (a % 2 == 0) {
            true -> println("число A четное, a * b = "+ a * b)
            false -> println("число A нечетное, a + b = "+ (a + b))
        }
    }
}
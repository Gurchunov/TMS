package com.example.tms

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        numberOfEvenNumbers()
    }

    private fun numberOfEvenNumbers() {
        var count = 0
        for (x in 1..99) {
            if (x % 2 == 0) {
                count++
            }
        }
        println(count)
    }
}
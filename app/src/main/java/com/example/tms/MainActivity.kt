package com.example.tms

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        sumNumber()
    }

    private fun sumNumber() {
        val a = 1..100
        var temp = 0
        for (x in a) {
            temp = temp.plus(x)
            println(temp)
        }
    }
}
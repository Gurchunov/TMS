package com.example.tms

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        sumNumber(1234)
    }

    private fun sumNumber(a: Int) {
        val chars = ("" + a).toCharArray()
        var temp = 0
        for (x in chars){
            temp = x.digitToInt().plus(temp)
        }
        println(temp)
    }
}
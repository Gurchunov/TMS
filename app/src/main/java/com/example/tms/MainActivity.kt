package com.example.tms

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        studentGrade(5)
    }
    private fun studentGrade(a: Int) {
        val message = "ваша оценка"
        when (a) {
            in 0..19 -> println("$message F")
            in 20..39 -> println("$message E")
            in 40..59 -> println("$message D")
            in 60..74 -> println("$message C")
            in 75..89 -> println("$message B")
            in 90..100 -> println("$message A")
            else -> println("такой оценки нет")
        }
    }
}
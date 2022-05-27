package com.example.tms

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.os.CountDownTimer
import com.example.tms.databinding.ActivityMainBinding
import com.example.tms.dz14.Dz14Fragment

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var timer: CountDownTimer? = null




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainer, ButtonsFragment.newInstance())
            .commit()
    }
}

//private fun numberOfEvenNumbers() {
//    var count = 0
//    for (x in 1..99) {
//        if (x % 2 == 0) {
//            count++
//        }
//    }
//    println(count)
//}
//

//
//private fun studentGrade(a: Int) {
//    val message = "ваша оценка"
//    when (a) {
//        in 0..19 -> println("$message F")
//        in 20..39 -> println("$message E")
//        in 40..59 -> println("$message D")
//        in 60..74 -> println("$message C")
//        in 75..89 -> println("$message B")
//        in 90..100 -> println("$message A")
//        else -> println("такой оценки нет")
//    }
//}
//
//private fun max(a: Int, b: Int, c: Int) {
//    val plus = a + b + c
//    val multiPlay = a * b * c
//    when {
//        plus == multiPlay -> println("значения равны")
//        plus > multiPlay -> println("$plus > multiPlay")
//        plus < multiPlay -> println("$plus < multiPlay")
//    }
//
//
//}






package com.example.tms

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.os.CountDownTimer
import com.example.tms.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var timer: CountDownTimer? = null


    private val arrayQuestions: Array<String> = arrayOf(
        "Я устроюсь на работу?",
        "Меня ждет успех?"
    )
    private val arrayAnswers: Array<String> = arrayOf(
        "Да",
        "Нет",
        "Возможно",
        "Скорее всего",
        "Имееются перспективы",
        "Вопрос задан не верно"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        numberOfEvenNumbers()
        isEvenA(3)
        studentGrade(5)
        max(1, 2, 3)
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

    private fun isEvenA(a: Int) {
        val b = 5
        when (a % 2 == 0) {
            true -> println("число A четное, a * b = " + a * b)
            false -> println("число A нечетное, a + b = " + (a + b))
        }
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

    private fun max(a: Int, b: Int, c: Int) {
        val plus = a + b + c
        val multiplay = a * b * c
        when {
            plus == multiplay -> println("значения равны")
            plus > multiplay -> println("$plus > $multiplay")
            plus < multiplay -> println("$plus < $multiplay")
        }

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
        output()
    }

    private fun output() {
        println(arrayQuestions.random())
        println(arrayAnswers.random())
    }
}
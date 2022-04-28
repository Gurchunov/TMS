package com.example.tms

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

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
    fun output() {
        println(arrayQuestions.random())
        println(arrayAnswers.random())
    }
    }
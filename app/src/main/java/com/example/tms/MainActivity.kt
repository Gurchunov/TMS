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

        output()
    }

    fun output() {
        println(arrayQuestions.random())
        println(arrayAnswers.random())
    }
}
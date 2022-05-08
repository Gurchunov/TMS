package com.example.tms

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlin.random.Random
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
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {

            btnOnfirm.setOnClickListener {
                if (timer == null) {
                    startTimer(10000)
                } else {
                    startTimer(edText.text.toString().toLong())
                }
            }
        }
    }

    private fun startTimer(time: Long) {
        timer?.cancel()
        timer = object : CountDownTimer(time, 1000) {
            override fun onTick(p0: Long) {
                binding.string.text = p0.toString()
            }

            override fun onFinish() {
                binding.string.text = "время вышло"
            }
        }.start()

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
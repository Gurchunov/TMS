package com.example.tms

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import com.example.tms.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var timer: CountDownTimer? = null

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
    }
}
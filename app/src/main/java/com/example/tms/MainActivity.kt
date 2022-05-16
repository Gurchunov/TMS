package com.example.tms

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.tms.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.apply {
            btnBolivia.setOnClickListener {
                val intent = Intent(applicationContext, BoliviaActivity::class.java)
                startActivity(intent)
            }
            btnMaldives.setOnClickListener {
                val intent = Intent(applicationContext, MaldiviActivity::class.java)
                startActivity(intent)
            }
            btnMauritius.setOnClickListener {
                val intent = Intent(applicationContext, MavrikiActivity::class.java)
                startActivity(intent)
            }
            btnUAE.setOnClickListener {
                val intent = Intent(applicationContext, OaeActivity::class.java)
                startActivity(intent)
            }
            btnSweden.setOnClickListener {
                val intent = Intent(applicationContext, ShveciaActivity::class.java)
                startActivity(intent)
            }
        }
    }
}
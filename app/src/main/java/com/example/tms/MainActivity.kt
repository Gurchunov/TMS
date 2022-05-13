package com.example.tms

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.widget.TextView
import androidx.activity.viewModels
import androidx.lifecycle.Observer

class MainActivity : AppCompatActivity() {
    private val myServer = MyServer()
    private val viewModel: MyViewMоdel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        lifecycle.addObserver(myServer)
        viewModel.setup()

        viewModel.firstName.observe(this, Observer {
            findViewById<TextView>(R.id.tvFirstName).text = it
        })
        viewModel.lastName.observe(this, Observer {
            findViewById<TextView>(R.id.tvLastName).text = it
        })
        viewModel.age.observe(this, Observer {
            findViewById<TextView>(R.id.tvAge).text = it.toString()
        })
    }
}
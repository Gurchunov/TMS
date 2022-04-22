package com.example.tms

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    var usersList: MutableList<User> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addUser("вася", "иванов", 15)
        addUser("петя", "смирнов", 16)
        addUser("коля", "соболев", 17)

        output()
    }

    private fun addUser(name: String, secondName: String, age: Int) {
        val user = User(name, secondName, age)
        usersList.add(user)
    }

    private fun output() {
        for (user in usersList) {
            println(user)
        }
    }
}
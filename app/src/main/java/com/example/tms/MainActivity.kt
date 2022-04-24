package com.example.tms

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    private var usersList: MutableList<User> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addUser("петя", "смирнов", 16)
        addUser("вася", "иванов", 15)
        addUser("коля", "соболев", 18)

        output()
        sortList(usersList)
        output()
        deleteUser(usersList)
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

    private fun sortList(usersList: MutableList<User>): MutableList<User> {
        usersList.sortWith(
            compareBy(String.CASE_INSENSITIVE_ORDER) { it.name })
        return usersList
    }

    private fun deleteUser(usersList: MutableList<User>): MutableList<User> {
        usersList.removeIf { user -> user.age < 18 }
        return usersList
    }
}
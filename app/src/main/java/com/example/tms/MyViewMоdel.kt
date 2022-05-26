package com.example.tms

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyViewMоdel: ViewModel() {
    val firstName = MutableLiveData<String>()
    val lastName = MutableLiveData<String>()
    val age = MutableLiveData<Int>()

    fun setup(){
        val apiFirstName = "Роман"
        val apiLastName = "Гурчунов"
        val apiAge = 24
        firstName.value = apiFirstName
        lastName.value = apiLastName
        age.value = apiAge
    }
}
package com.example.tms.dz14

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyViewModel : ViewModel() {
    val arrayAnswers: Array<String> = arrayOf(
        "Да",
        "Нет",
        "Возможно",
        "Скорее всего",
        "Имееются перспективы",
        "Вопрос задан не верно"
    )
    val arrayQuestions: Array<String> = arrayOf(
        "Я устроюсь на работу?",
        "Меня ждет успех?"
    )
    val questionCurrentLiveDate: MutableLiveData<String> by lazy {
        MutableLiveData<String>()
    }
    val answerCurrentLiveDate: MutableLiveData<String> by lazy {
        MutableLiveData<String>()
    }

    fun setInfo() {
        questionCurrentLiveDate.value = arrayQuestions.random().toString()
        answerCurrentLiveDate.value = arrayAnswers.random().toString()
    }
}
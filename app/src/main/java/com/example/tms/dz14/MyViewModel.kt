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
    val questionCurrentViewModel: MutableLiveData<String> by lazy {
        MutableLiveData<String>()
    }
    val answerCurrentViewModel: MutableLiveData<String> by lazy {
        MutableLiveData<String>()
    }

    fun setInfo() {
        questionCurrentViewModel.value = arrayQuestions.random().toString()
        answerCurrentViewModel.value = arrayAnswers.random().toString()
    }
}
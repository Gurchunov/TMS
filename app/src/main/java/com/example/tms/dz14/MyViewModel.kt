package com.example.tms.dz14

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyViewModel : ViewModel() {
    val arrayAnswers: String = arrayOf(
        "Да",
        "Нет",
        "Возможно",
        "Скорее всего",
        "Имееются перспективы",
        "Вопрос задан не верно"
    ).random().toString()
    val arrayQuestions: String = arrayOf(
        "Я устроюсь на работу?",
        "Меня ждет успех?"
    ).random().toString()
    val questionCurrentViewModel: MutableLiveData<String> by lazy {
        MutableLiveData<String>()
    }
    val answerCurrentViewModel: MutableLiveData<String> by lazy {
        MutableLiveData<String>()
    }
}
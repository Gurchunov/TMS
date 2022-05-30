package com.example.tms.dz14

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyViewModel: ViewModel() {
    val questionViewModel = MutableLiveData<String>()
    val answerViewModel = MutableLiveData<String>()
}
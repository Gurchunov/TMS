package com.example.tms.dz14

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.tms.R
import com.example.tms.databinding.FragmentButtonsBinding
import com.example.tms.databinding.FragmentDz14Binding

class Dz14Fragment : Fragment() {
private lateinit var binding: FragmentDz14Binding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDz14Binding.inflate(inflater,container, false)
        binding.apply {
            tvQuestion.text =  arrayQuestions.random().toString()
            tvAnswer.text = arrayAnswers.random().toString()
            btnRandom.setOnClickListener {
               tvQuestion.text =  arrayQuestions.random().toString()
                tvAnswer.text = arrayAnswers.random().toString()
            }
        }
        return binding.root
    }



    private val arrayAnswers: Array<String> = arrayOf(
        "Да",
        "Нет",
        "Возможно",
        "Скорее всего",
        "Имееются перспективы",
        "Вопрос задан не верно"
    )
    private val arrayQuestions: Array<String> = arrayOf(
        "Я устроюсь на работу?",
        "Меня ждет успех?"
    )

    companion object {
        @JvmStatic
        fun newInstance() = Dz14Fragment()
    }
}
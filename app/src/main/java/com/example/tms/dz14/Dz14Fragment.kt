package com.example.tms.dz14

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.Observer
import com.example.tms.databinding.FragmentDz14Binding

class Dz14Fragment : Fragment() {
    private lateinit var binding: FragmentDz14Binding
    private val viewModel: MyViewModel by viewModels()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDz14Binding.inflate(inflater, container, false)
        binding.apply {
            tvQuestion.text = arrayQuestions.random().toString()
            tvAnswer.text = arrayAnswers.random().toString()
        }
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        viewModel.questionViewModel.observe(this@Dz14Fragment as LifecycleOwner, Observer {
            binding.tvQuestion.text = it
        })
        viewModel.answerViewModel.observe(this@Dz14Fragment as LifecycleOwner, Observer {
            binding.tvAnswer.text = it
        })
        binding.apply {
            viewModel.questionViewModel.observe(this@Dz14Fragment as LifecycleOwner, Observer {
                tvQuestion.text = it
            })
            viewModel.answerViewModel.observe(this@Dz14Fragment as LifecycleOwner, Observer {
                tvAnswer.text = it
            })
            btnRandom.setOnClickListener {
                viewModel.questionViewModel.value = arrayQuestions.random().toString()
                viewModel.answerViewModel.value = arrayAnswers.random().toString()
            }
        }
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
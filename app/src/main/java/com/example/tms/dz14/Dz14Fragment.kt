package com.example.tms.dz14

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
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
            tvQuestion.text = viewModel.arrayQuestions
            tvAnswer.text = viewModel.arrayAnswers
        }
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.apply {
            btnRandom.setOnClickListener {
                viewModel.questionCurrentViewModel.value = viewModel.arrayQuestions
                viewModel.answerCurrentViewModel.value = viewModel.arrayAnswers
            }
        }
        viewModel.questionCurrentViewModel.observe(this@Dz14Fragment as LifecycleOwner, Observer {
            binding.tvQuestion.text = it
        })
        viewModel.answerCurrentViewModel.observe(this@Dz14Fragment as LifecycleOwner, Observer {
            binding.tvAnswer.text = it
        })
    }

    companion object {
        @JvmStatic
        fun newInstance() = Dz14Fragment()
    }
}
package com.example.TP4_CountMVP.mvp.view

import android.app.Activity
import android.widget.Toast
import com.example.TP4_CountMVP.R
import com.example.TP4_CountMVP.databinding.ActivityMainBinding
import com.example.TP4_CountMVP.mvp.contract.MainContract

class MainView(activity: Activity) : ActivityView(activity), MainContract.View {
    private var binding: ActivityMainBinding = ActivityMainBinding.inflate(activity.layoutInflater)

    init {
        activity.setContentView(binding.root)
    }

    override fun setCount(count: String) {
        binding.count.text = count
    }

    override fun onClickIncreaseButton(function: () -> Unit) {
        binding.increaseButton.setOnClickListener { (function()) }
    }

    override fun onClickDecreaseButton(function: () -> Unit) {
        binding.decreaseButton.setOnClickListener { (function()) }
    }

    override fun onClickResetButton(function: () -> Unit) {
        binding.resetButton.setOnClickListener { (function()) }
    }

    override fun getInsertCounter(): Int {
        return binding.insertText.text.toString().toInt()
    }

    override fun valueIsEmpty(): Boolean {
        return binding.insertText.text.isBlank()
    }

    override fun showToastErrorEmptyMessage() {
        Toast.makeText(context, activity?.getString(R.string.errorToastMessage), Toast.LENGTH_SHORT)
            .show()
    }

}
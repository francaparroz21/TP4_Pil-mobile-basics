package com.example.TP4_CountMVP.mvp.contract

interface CounterContract {
    interface Model {
        fun getCount(): String
        fun setCount(acc: Int)
        fun increase(acc: Int)
        fun decrease(acc: Int)
        fun reset()
    }

    interface View {
        fun setCount(count: String)
        fun onClickIncreaseButton(function: () -> Unit)
        fun onClickDecreaseButton(function: () -> Unit)
        fun onClickResetButton(function: () -> Unit)
        fun getInsertCounter(): Int
        fun valueIsEmpty(): Boolean
        fun showToastErrorEmptyMessage()
        fun showToastAlreadyResetPressed()
        fun getCounterInView(): Int
    }

    interface Presenter {
        fun onClickIncreaseButton()
        fun onClickDecreaseButton()
        fun onClickResetButton()
    }
}

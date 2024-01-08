package com.example.geoquiz

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel

const val ANSWER_IS_CHECKED = "ANSWER_IS_CHECKED"

class CheatViewModel(private val savedStateHandle: SavedStateHandle): ViewModel() {
    var answerIsChecked: Boolean
        get() = savedStateHandle[ANSWER_IS_CHECKED] ?: false
        set(value) = savedStateHandle.set(ANSWER_IS_CHECKED, value)
}
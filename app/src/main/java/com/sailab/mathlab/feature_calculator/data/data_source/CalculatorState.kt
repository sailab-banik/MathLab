package com.sailab.mathlab.feature_calculator.data.data_source

import com.sailab.mathlab.feature_calculator.domain.util.CalculatorOperation

data class CalculatorState(
    val number1: String = "",
    val number2: String = "",
    val operation: CalculatorOperation? = null
)
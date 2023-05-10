package com.sailab.mathlab.feature_calculator.domain.util

sealed class CalculatorOperation(
    val symbol: String
) {
    object Add: CalculatorOperation("+")
    object Subtract: CalculatorOperation("-")
    object Multiply: CalculatorOperation("×")
    object Divide: CalculatorOperation("÷")
    object Percentage: CalculatorOperation("%")
}

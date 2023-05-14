package com.sailab.mathlab.feature_calculator.domain.util

sealed class CalculatorOperation(
    val symbol: String
) {
    object Add: CalculatorOperation("+")
    object Subtract: CalculatorOperation("-")
    object Multiply: CalculatorOperation("×")
    object Divide: CalculatorOperation("÷")
    object Percentage: CalculatorOperation("%")
    object Modulus: CalculatorOperation("mod")
    object And: CalculatorOperation("&")
    object Or: CalculatorOperation("|")
    object Xor: CalculatorOperation("^")
    object RightShift: CalculatorOperation(">>")
    object LeftShift: CalculatorOperation("<<")
    object PowerToY: CalculatorOperation("^")
}

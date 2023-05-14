package com.sailab.mathlab.feature_calculator.domain.util

sealed class CalculatorAction{
    data class Number(val number: Int): CalculatorAction()
    object Clear: CalculatorAction()
    object Delete: CalculatorAction()
    data class Operation(val operation: CalculatorOperation): CalculatorAction()
    object Calculate: CalculatorAction()
    object Decimal: CalculatorAction()
    object PlusMinus: CalculatorAction()
    object DecToBin: CalculatorAction()
    object DecToHex: CalculatorAction()
    object DecToOct: CalculatorAction()
    object Not: CalculatorAction()
    object Pi: CalculatorAction()
    object Exponent: CalculatorAction()
    object Sin: CalculatorAction()
    object Cos: CalculatorAction()
    object Tan: CalculatorAction()
    object Log: CalculatorAction()
    object Ln: CalculatorAction()
    object Square: CalculatorAction()
    object Root: CalculatorAction()
}

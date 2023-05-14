package com.sailab.mathlab.feature_calculator.presentation

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.sailab.mathlab.feature_calculator.domain.util.CalculatorAction
import com.sailab.mathlab.feature_calculator.domain.util.CalculatorOperation
import kotlin.math.*

class CalculatorViewModel: ViewModel() {
    var state by mutableStateOf(CalculatorState())

    fun onAction(action: CalculatorAction) {
        when(action) {
            is CalculatorAction.Number -> enterNumber(action.number)
            is CalculatorAction.Delete -> delete()
            is CalculatorAction.Clear -> state = CalculatorState()
            is CalculatorAction.Operation -> enterOperation(action.operation)
            is CalculatorAction.Decimal -> enterDecimal()
            is CalculatorAction.Calculate -> calculate()
            is CalculatorAction.PlusMinus -> plusMinus()
            is CalculatorAction.DecToBin -> decToBin()
            is CalculatorAction.DecToHex -> decToHex()
            is CalculatorAction.DecToOct -> decToOct()
            is CalculatorAction.Not -> calNot()
            is CalculatorAction.Pi -> displayPi()
            is CalculatorAction.Exponent -> displayExponent()
            is CalculatorAction.Sin -> performSin()
            is CalculatorAction.Cos -> performCos()
            is CalculatorAction.Tan -> performTan()
            is CalculatorAction.Log -> performLog()
            is CalculatorAction.Ln -> performLn()
            is CalculatorAction.Square -> performSquare()
            is CalculatorAction.Root -> performRoot()
        }
    }

    private fun performRoot() {
        state = if (state.number1.isNotBlank() && state.operation == null) {
            state.copy(
                number1 = sqrt(state.number1.toDouble()).toString()
            )
        } else {
            state
        }
    }

    private fun performSquare() {
        state = if (state.number1.isNotBlank() && state.operation == null) {
            state.copy(
                number1 = state.number1.toDouble().pow(2.0).toString()
            )
        } else {
            state
        }
    }

    private fun performLn() {
        state = if (state.number1.isNotBlank() && state.operation == null) {
            state.copy(
                number1 = ln(state.number1.toDouble()).toString()
            )
        } else if(state.number2.isNotBlank()){
            state.copy(
                number2 = ln(state.number2.toDouble()).toString()
            )
        } else {
            state
        }
    }

    private fun performLog() {
        state = if (state.number1.isNotBlank() && state.operation == null) {
            state.copy(
                number1 = log10(state.number1.toDouble()).toString()
            )
        } else if(state.number2.isNotBlank()){
            state.copy(
                number2 = log10(state.number2.toDouble()).toString()
            )
        } else {
            state
        }
    }

    private fun performTan() {
        state = if (state.number1.isNotBlank() && state.operation == null) {
            state.copy(
                number1 = tan(Math.toRadians(state.number1.toDouble())).toString()
            )
        } else if(state.number2.isNotBlank()){
            state.copy(
                number2 = tan(Math.toRadians(state.number2.toDouble())).toString()
            )
        } else {
            state
        }
    }

    private fun performCos() {
        state = if (state.number1.isNotBlank() && state.operation == null) {
            state.copy(
                number1 = cos(Math.toRadians(state.number1.toDouble())).toString()
            )
        } else if(state.number2.isNotBlank()){
            state.copy(
                number2 = cos(Math.toRadians(state.number2.toDouble())).toString()
            )
        } else {
            state
        }
    }

    private fun performSin() {
        state = if (state.number1.isNotBlank() && state.operation == null) {
            state.copy(
                number1 = sin(Math.toRadians(state.number1.toDouble())).toString()
            )
        } else if(state.number2.isNotBlank()){
            state.copy(
                number2 = sin(Math.toRadians(state.number2.toDouble())).toString()
            )
        } else {
            state
        }
    }

    private fun displayExponent() {
        state = if (state.number1.isBlank()) {
            state.copy(
                number1 = Math.E.toString()
            )
        } else if (state.number1.isNotBlank() && state.operation == null){
            state.copy(
                number1 = (state.number1.toDouble() * Math.E).toString()
            )
        } else if(state.number2.isNotBlank()){
            state.copy(
                number2 = (state.number2.toDouble() * Math.E).toString()
            )
        }
        else {
            state
        }
    }

    private fun displayPi() {
        state = if (state.number1.isBlank()) {
            state.copy(
                number1 = Math.PI.toString()
            )
        } else if (state.number1.isNotBlank() && state.operation == null){
            state.copy(
                number1 = (state.number1.toDouble() * Math.PI).toString()
            )
        } else if(state.number2.isNotBlank()){
            state.copy(
                number2 = (state.number2.toDouble() * Math.PI).toString()
            )
        }
        else {
            state
        }
    }

    private fun calNot() {
        state = if (state.number1.isNotBlank() && state.operation == null) {
            state.copy(
                number1 = state.number1.toLongOrNull()?.inv()?.toInt().toString()
            )
        } else {
            state
        }
    }


    private fun decToOct() {
        state = if(state.number1.isNotBlank() && state.operation == null) {
            val decimalNumber = state.number1.toLongOrNull()
            if(decimalNumber != null) {
                state.copy(
                    number1 = decimalNumber.toString(8)
                )
            } else {
                state
            }
        } else {
            state
        }
    }

    private fun decToHex() {
        state = if(state.number1.isNotBlank() && state.operation == null) {
            val decimalNumber = state.number1.toLongOrNull()
            if(decimalNumber != null) {
                state.copy(
                    number1 = decimalNumber.toString(16)
                )
            } else {
                state
            }
        } else {
            state
        }
    }

    private fun decToBin() {
        state = if(state.number1.isNotBlank() && state.operation == null) {
            val decimalNumber = state.number1.toLongOrNull()
            if(decimalNumber != null) {
                state.copy(
                    number1 = decimalNumber.toString(2)
                )
            } else {
                state
            }
        } else {
            state
        }
    }



    private fun plusMinus() {
        state = if(state.number1.isNotBlank() && !state.number1.contains("-")) {
            state.copy(
                number1 = "-" + state.number1
            )
        } else {
            state.copy(
                number1 = state.number1.removePrefix("-")
            )
        }
    }

    private fun enterOperation(operation: CalculatorOperation) {
        if(state.number1.isNotBlank()) {
            state = state.copy(operation = operation)
        }
    }

    private fun calculate() {
        val number1 = state.number1.toDoubleOrNull()
        val number2 = state.number2.toDoubleOrNull()
        if(number1 != null && number2 != null) {
            val result = when(state.operation) {
                is CalculatorOperation.Add -> number1 + number2
                is CalculatorOperation.Subtract -> number1 - number2
                is CalculatorOperation.Multiply -> number1 * number2
                is CalculatorOperation.Divide -> number1 / number2
                is CalculatorOperation.Percentage -> (number1 / number2) * 100
                is CalculatorOperation.Modulus -> number1 % number2
                is CalculatorOperation.And -> number1.toInt() and number2.toInt()
                is CalculatorOperation.Or -> number1.toInt() or number2.toInt()
                is CalculatorOperation.Xor -> number1.toInt() xor number2.toInt()
                is CalculatorOperation.RightShift -> number1.toInt() shr number2.toInt()
                is CalculatorOperation.LeftShift -> number1.toInt() shl number2.toInt()
                is CalculatorOperation.PowerToY -> Math.pow(number1, number2)
                null -> return
            }
            state.copy(
                number1 = result.toString().take(15),
                number2 = "",
                operation = null
            ).also { state = it }
        }
    }

    private fun delete() {
        when {
            state.number2.isNotBlank() -> state = state.copy(
                number2 = state.number2.dropLast(1)
            )
            state.operation != null -> state = state.copy(
                operation = null
            )
            state.number1.isNotBlank() -> state = state.copy(
                number1 = state.number1.dropLast(1)
            )
        }
    }

    private fun enterDecimal() {
        if(state.operation == null && !state.number1.contains(".") && state.number1.isNotBlank()) {
            state = state.copy(
                number1 = state.number1 + "."
            )
            return
        } else if(!state.number2.contains(".") && state.number2.isNotBlank()) {
            state = state.copy(
                number2 = state.number2 + "."
            )
        }
    }

    private fun enterNumber(number: Int) {
        if(state.operation == null) {
            if(state.number1.length >= MAX_NUM_LENGTH) {
                return
            }
            state = state.copy(
                number1 = state.number1 + number
            )
            return
        }
        if(state.number2.length >= MAX_NUM_LENGTH) {
            return
        }
        state = state.copy(
            number2 = state.number2 + number
        )
    }

    companion object {
        private const val MAX_NUM_LENGTH = 40
    }
}
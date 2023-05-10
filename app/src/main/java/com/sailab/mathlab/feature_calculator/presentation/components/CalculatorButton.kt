package com.sailab.mathlab.feature_calculator.presentation.components

import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun CalculatorButton(
    symbol: String,
    color: ButtonColors,
    onClick: ()-> Unit
) {
    ElevatedButton(
        modifier = Modifier
            .size(80.dp),
        colors = color,
        shape = CircleShape,
        onClick = onClick
    ) {
        Text(
            text = symbol,
            fontSize = MaterialTheme.typography.bodyLarge.fontSize,
            fontStyle = MaterialTheme.typography.labelMedium.fontStyle
        )
    }
}
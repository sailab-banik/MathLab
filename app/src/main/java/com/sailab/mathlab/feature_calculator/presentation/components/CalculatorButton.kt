package com.sailab.mathlab.feature_calculator.presentation.components

import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import com.sailab.mathlab.core.presentation.main_screen.components.SuperSubTextStyle

@Composable
fun CalculatorButton(
    symbol: String,
    superScript: String? = "",
    color: ButtonColors,
    onClick: ()-> Unit
) {
    val superSubTextStyle = SuperSubTextStyle()
    ElevatedButton(
        modifier = Modifier
            .size(80.dp),
        colors = color,
        shape = CircleShape,
        onClick = onClick
    ) {
        Text(
            text = buildAnnotatedString{
                    append(symbol)
                    withStyle(superSubTextStyle.superScript) {
                        append(superScript)
                    }
            },
            fontSize = MaterialTheme.typography.bodyLarge.fontSize,
            fontStyle = MaterialTheme.typography.labelMedium.fontStyle
        )
    }
}
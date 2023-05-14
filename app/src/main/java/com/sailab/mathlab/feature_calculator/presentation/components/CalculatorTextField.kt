package com.sailab.mathlab.feature_calculator.presentation.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.sailab.mathlab.core.presentation.main_screen.components.WindowInfo
import com.sailab.mathlab.core.presentation.main_screen.components.rememberWindowInfo
import com.sailab.mathlab.feature_calculator.presentation.CalculatorViewModel

@ExperimentalMaterial3Api
@Composable
fun CalculatorTextField(
    minHeight: Dp,
    horizontalPadding: Dp = 20.dp
) {
    val viewModel = viewModel<CalculatorViewModel>()
    val state = viewModel.state
    val windowInfo = rememberWindowInfo()

    ElevatedCard(
        modifier = Modifier
            .padding(
                horizontal = horizontalPadding,
                vertical = 10.dp
            )
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .heightIn(
                    min= if(windowInfo.screenWidthInfo is WindowInfo.WindowType.Compact) {
                        minHeight
                    } else {
                        80.dp
                    },
                    max = 230.dp
                )
        ) {
            val text = state.number1 + (state.operation?.symbol ?: "") + state.number2
            Text(
                modifier = Modifier
                    .align(Alignment.BottomEnd)
                    .padding(16.dp),
                text = text,
                fontSize = if(text.length < 17) {
                    MaterialTheme.typography.headlineLarge.fontSize
                } else {
                    MaterialTheme.typography.headlineMedium.fontSize
                },
                lineHeight = 32.sp
            )
        }
    }
}
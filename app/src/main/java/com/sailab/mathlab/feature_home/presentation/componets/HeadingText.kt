package com.sailab.mathlab.feature_home.presentation.componets

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun HeadingText(
    text: String,
    startPadding: Dp = 20.dp
) {
    Text(
        text = text,
        modifier = Modifier.padding(
            start = startPadding,
            end = 20.dp,
            top = 20.dp,
            bottom = 15.dp
        ),
        fontWeight = FontWeight.Bold,
        fontSize = MaterialTheme.typography.titleLarge.fontSize,
        color = MaterialTheme.colorScheme.onPrimaryContainer
    )
}
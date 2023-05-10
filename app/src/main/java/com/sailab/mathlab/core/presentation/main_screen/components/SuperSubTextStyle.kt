package com.sailab.mathlab.core.presentation.main_screen.components

import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.style.BaselineShift
import androidx.compose.ui.unit.sp

class SuperSubTextStyle {
    val superScript = SpanStyle(
        baselineShift = BaselineShift.Superscript,
        fontSize = 12.sp
    )

    val subScript = SpanStyle(
        baselineShift = BaselineShift.Subscript,
        fontSize = 12.sp
    )
}
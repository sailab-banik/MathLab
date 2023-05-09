package com.sailab.mathlab.feature_home.presentation.componets

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.SuggestionChip
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@ExperimentalMaterial3Api
@Composable
fun HomeChips() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 20.dp)
    ) {
        Column(
            modifier = Modifier.padding(horizontal = 8.dp)
        ) {
            SuggestionChip(
                label = { Text(text = "Math") },
                onClick = { /*TODO*/ }
            )
        }
        Column(
            modifier = Modifier.padding(horizontal = 8.dp)
        ) {
            SuggestionChip(
                label = { Text(text = "Class 11") },
                onClick = { /*TODO*/ }
            )
        }
    }
}
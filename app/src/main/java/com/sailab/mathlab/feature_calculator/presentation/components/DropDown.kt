package com.sailab.mathlab.feature_calculator.presentation.components

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.outlined.Edit
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.material3.Divider
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp


@Composable
fun DropDown() {
    var expanded by remember { mutableStateOf(false) }
    Box(modifier = Modifier
        .fillMaxWidth()
        .wrapContentSize(Alignment.TopStart)
        .padding(horizontal = 20.dp)
    ) {
        IconButton(onClick = { expanded = true }) {
            Icon(Icons.Default.ArrowDropDown, contentDescription = "Localized description")
        }
        DropdownMenu(
            expanded = expanded,
            onDismissRequest = { expanded = false }
        ) {
            DropdownMenuItem(
                text = { Text("In") },
                onClick = { /* Handle edit! */ },
            )
            DropdownMenuItem(
                text = { Text("cm") },
                onClick = { /* Handle settings! */ },
            )
            DropdownMenuItem(
                text = { Text("m") },
                onClick = { /* Handle send feedback! */ }
            )
        }
    }
}
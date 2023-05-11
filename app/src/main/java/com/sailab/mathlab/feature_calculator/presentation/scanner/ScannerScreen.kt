package com.sailab.mathlab.feature_calculator.presentation.scanner

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.modifier.modifierLocalMapOf
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.sailab.mathlab.R

@Composable
fun ScannerScreen() {
    Column(
        modifier = Modifier.fillMaxSize(),

    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 20.dp),
            contentAlignment = Alignment.Center
        ) {
            AsyncImage(
                model = R.drawable.math_img,
                contentDescription = ""
            )
        }

        Text(
            modifier = Modifier
                .align(Alignment.End)
                .padding(20.dp),
            text = "3+2=5",
            fontSize = MaterialTheme.typography.displayLarge.fontSize
        )

        ElevatedButton(
            modifier = Modifier
                .align(Alignment.End)
                .padding(horizontal = 10.dp)
                .clip(RoundedCornerShape(0.dp))
                .width(200.dp)
                .height(65.dp),
            onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(
                MaterialTheme.colorScheme.errorContainer
            )
        ) {
            Text(
                text = "=",
                fontSize = MaterialTheme.typography.displaySmall.fontSize
            )
        }

        Icon(modifier = Modifier
            .padding(top = 160.dp)
            .size(72.dp)
            .align(Alignment.CenterHorizontally),
            imageVector = Icons.Default.PhotoCamera,
            contentDescription = "",
            tint = MaterialTheme.colorScheme.primary
        )
    }
}
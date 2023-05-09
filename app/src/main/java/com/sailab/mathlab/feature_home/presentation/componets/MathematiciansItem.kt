package com.sailab.mathlab.feature_home.presentation.componets

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.sailab.mathlab.feature_home.domain.model.Mathematicians

@ExperimentalMaterial3Api
@Composable
fun MathematiciansItem(
    mathematicians: Mathematicians
) {
    OutlinedCard(
        modifier = Modifier
            .size(
                width = 130.dp,
                height = 160.dp
            )
            .padding(10.dp),
        onClick = { /*TODO*/ },
        colors = CardDefaults.outlinedCardColors()
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
        ) {
            AsyncImage(
                model = mathematicians.image,
                contentDescription = "",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(80.dp)
                    .align(Alignment.Center)
                    .clip(CircleShape)
            )
            Text(
                modifier = Modifier
                    .align(Alignment.BottomCenter)
                    .padding(4.dp),
                text = mathematicians.title,
                fontSize = MaterialTheme.typography.labelSmall.fontSize,
                fontWeight = FontWeight.Bold
            )
        }
    }
}
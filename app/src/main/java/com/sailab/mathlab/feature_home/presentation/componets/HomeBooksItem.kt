package com.sailab.mathlab.feature_home.presentation.componets

import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AutoStories
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.sailab.mathlab.feature_home.domain.model.HomeBooks


@ExperimentalMaterial3Api
@Composable
fun HomeBooksItem(
    books: HomeBooks
) {
    val context = LocalContext.current

    ElevatedCard(
        modifier = Modifier
            .size(
                194.dp
            )
            .padding(10.dp),
        onClick = {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(books.link))
            context.startActivity(intent)
        },
        colors = CardDefaults.elevatedCardColors(),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 4.dp,
            pressedElevation = 10.dp
        )
    ) {
        Box(modifier = Modifier.fillMaxSize()) {
            Icon(
                imageVector = Icons.Default.AutoStories,
                contentDescription = books.title,
                modifier = Modifier.padding(8.dp),
                tint = MaterialTheme.colorScheme.primary
            )
            Text(
                text = books.title,
                modifier = Modifier.align(Alignment.Center),
                fontSize = MaterialTheme.typography.titleLarge.fontSize,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = books.description,
                modifier = Modifier
                    .padding(bottom = 4.dp)
                    .align(Alignment.BottomCenter),
                fontSize = MaterialTheme.typography.labelSmall.fontSize
            )
        }
    }
}

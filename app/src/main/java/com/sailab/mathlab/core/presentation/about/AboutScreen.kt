package com.sailab.mathlab.core.presentation.about


import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.sailab.mathlab.R
import com.sailab.mathlab.core.domain.repository.TechStackRepository
import com.sailab.mathlab.feature_home.presentation.componets.HeadingText

@Composable
fun AboutScreen() {
    val aboutFontSize = MaterialTheme.typography.bodyLarge.fontSize
    val bulletColor = MaterialTheme.colorScheme.onPrimaryContainer

    val techStackRepository = TechStackRepository()
    val techStackData = techStackRepository.getTechStackData()

    val featuresList = listOf(
        "General Calculator",
        "Scientific Calculator",
        "Programmer Calculator",
        "Unit Converter",
        "Scanner Calculator",
        "Writing and Saving Notes"
    )



    LazyColumn(
        modifier = Modifier
            .padding(
                horizontal = 20.dp,
                vertical = 4.dp
            ),
        content = {
            item {
                HeadingText(text = "Overview", startPadding = 0.dp)
            }

            item {
                Text(
                    text = "MathLab is a mathematical tool build in Android Platform using Android Jetpack Compose. It uses latest Material 3 Designing with Dynamic Color Scheme. This project is build on MVVM Clean Architecture with Room Database.",
                    fontSize = aboutFontSize,
                    textAlign = TextAlign.Justify
                )
            }

            item {
                HeadingText(text = "Features", startPadding = 0.dp)
            }

            items(featuresList) {
                Row(
                    modifier = Modifier.padding(8.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Canvas(
                        modifier = Modifier
                            .padding(end = 8.dp)
                            .size(8.dp)
                    ){
                        drawCircle(bulletColor)
                    }
                    Text(
                        text = it,
                        fontSize = aboutFontSize
                    )
                }
            }

            item{
                HeadingText(text = "Tech Stacks", startPadding = 0.dp)
            }

            items(items = techStackData) {
                Row(
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    AsyncImage(
                        modifier = Modifier
                            .padding(end = 32.dp, bottom = 8.dp)
                            .size(80.dp),
                        model = it.image,
                        contentDescription = it.title
                    )
                    Text(
                        text = it.title,
                        fontSize = aboutFontSize
                    )
                }
            }

            item{
                HeadingText(text = "Developer Profile", startPadding = 0.dp)
            }

            item {
                Row(
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    AsyncImage(
                        modifier = Modifier
                            .padding(end = 10.dp)
                            .size(160.dp)
                            .clip(CircleShape),
                        model = R.drawable.developer,
                        contentScale = ContentScale.Inside,
                        contentDescription = "Developer Image"
                    )
                    Column(
                        modifier = Modifier.padding(8.dp)
                    ) {
                        Text(
                            modifier = Modifier.padding(2.dp),
                            text = "Sailab Banik",
                            fontSize = aboutFontSize,
                            fontWeight = FontWeight.Bold
                        )
                        Text(
                            modifier = Modifier.padding(2.dp),
                            text = "BTech CSE'23",
                            fontSize = aboutFontSize,
                        )
                        Text(
                            modifier = Modifier.padding(2.dp),
                            text = "Associated with ICFAI University Tripura",
                            fontSize = aboutFontSize
                        )
                    }
                }
            }
        }
    )
}
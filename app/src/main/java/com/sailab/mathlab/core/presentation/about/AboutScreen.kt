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
        "Intuitive UI",
        "Navigation Drawer with Gestures",
        "General Calculator",
        "Scientific Calculator",
        "Programmer Calculator",
        "Unit Converter",
        "Scanner Calculator",
        "Writing and Saving Notes",
        "Read Math Books",
        "Read About Mathematicians",
        "Dynamic Colors for API 32 or Above",
        "Searching",
        "Notification"
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
                    text = "MathLab is an innovative Android app designed to solve complex mathematical problems with ease. Built on MVVM Clean Architecture, MathLab provides an intuitive user interface that allows users to navigate through a range of features effortlessly.\n" +
                            "\n" +
                            "With its powerful features, MathLab provides an all-in-one solution for your mathematical needs. The app includes a General Calculator, Scientific Calculator, and Coding Calculator to help users solve simple to complex mathematical problems. Additionally, the app includes a Scan to Calculate feature, allowing users to capture equations and instantly solve them.\n" +
                            "\n" +
                            "MathLab also includes a Unit Converter, Note Writing and saving, and a library of math books and information about mathematicians. Users can access dynamic colors for API 32 or above to customize their experience.\n" +
                            "\n" +
                            "The app is built using the latest technology stack, including Android Studio, Kotlin, Jetpack Compose, Material 3, Dagger Hilt for Dependency Injection, Coil Compose for Asynchronous Image Loading, ML Kit for Text Recognition. These technologies enable MathLab to deliver a fast and efficient performance, making it a top choice for anyone who needs quick and accurate math solutions.\n" +
                            "\n" +
                            "The perks of MathLab Android App are numerous. It is accessible on-the-go and available anytime, anywhere, making it a convenient tool for students, professionals, and anyone who needs quick access to mathematical solutions. It provides a range of features that cater to a variety of mathematical needs, from simple calculations to complex problem-solving. Furthermore, with its intuitive UI and dynamic colors, MathLab is a pleasure to use.\n" +
                            "\n" +
                            "In conclusion, MathLab is an exceptional Android app that provides a comprehensive solution to all your mathematical needs. With its user-friendly interface, advanced features, and top-notch performance, MathLab is a must-have tool for anyone who needs quick and accurate mathematical solutions.\n",
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
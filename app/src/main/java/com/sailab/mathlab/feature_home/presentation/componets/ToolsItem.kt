package com.sailab.mathlab.feature_home.presentation.componets

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.sailab.mathlab.util.Screens
import com.sailab.mathlab.feature_home.domain.model.Tools

@ExperimentalMaterial3Api
@Composable
fun ToolsItem(
    tools:Tools,
    navController: NavController
) {
    ElevatedCard(
        modifier = Modifier
            .size(
                width = 130.dp,
                height = 100.dp
            )
            .padding(10.dp),
        onClick = {
          when(tools.title) {
              "Notes" -> navController.navigate(
                  Screens.NotesScreen.route
              )

              "Scanner" -> navController.navigate(
                  Screens.ScannerScreen.route
              )

              "Coding Calculator" -> navController.navigate(
                  Screens.CodingCalculatorScreen.route
              )

              "Converter" -> navController.navigate(
                  Screens.ConverterScreen.route
              )

              "General Calculator" -> navController.navigate(
                  Screens.GeneralCalculatorScreen.route
              )

              "Scientific Calculator" -> navController.navigate(
                  Screens.ScientificCalculatorScreen.route
              )
          }
        },
        colors = CardDefaults.elevatedCardColors(),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 4.dp,
            pressedElevation = 10.dp
        )
    ) {
        Row(
            modifier = Modifier.fillMaxSize(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Icon(
                imageVector = tools.icon,
                contentDescription = tools.title,
                modifier = Modifier
                    .size(48.dp)
                    .padding(end = 8.dp),
                tint = MaterialTheme.colorScheme.primary
            )
            Text(
                text = tools.title,
                fontSize = MaterialTheme.typography.labelSmall.fontSize,
                fontWeight = MaterialTheme.typography.headlineMedium.fontWeight
            )
        }
    }
}
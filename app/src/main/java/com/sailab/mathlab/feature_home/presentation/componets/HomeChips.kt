package com.sailab.mathlab.feature_home.presentation.componets

import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.SuggestionChip
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.navOptions
import com.sailab.mathlab.util.Screens

@ExperimentalMaterial3Api
@Composable
fun HomeChips(
    navController: NavController
) {
    val context = LocalContext.current
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 20.dp)
    ) {
        Column(
            modifier = Modifier.padding(horizontal = 8.dp)
        ) {
            SuggestionChip(
                label = { Text(text = "Scanner") },
                onClick = {
                    navController.navigate(
                    Screens.ScannerScreen.route,
                    navOptions {
                        popUpTo(Screens.HomeScreen.route) {
                            saveState = true
                        }
                        this.launchSingleTop = true
                        this.restoreState = true
                    }
                    )
                }
            )
        }
        Column(
            modifier = Modifier.padding(horizontal = 8.dp)
        ) {
            SuggestionChip(
                label = { Text(text = "Class 11") },
                onClick = {
                    val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/12aIAgoAHtAAx-p0Euv8BDd1GW4k8ayzm/view?usp=share_link"))
                    context.startActivity(intent)
                }
            )
        }
    }
}
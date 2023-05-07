package com.sailab.mathlab.core.presentation.main_screen.components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.DrawerState
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DrawerContent(
    navController: NavHostController,
    drawerState: DrawerState
) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)
    ) {
        item {
            Text(
                text = "MathLab",
                modifier = Modifier.padding(20.dp),
                fontSize = 16.sp
            )
            Column(
                modifier = Modifier,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Spacer(modifier = Modifier.height(10.dp))

                NavigationDrawerItems(navController, drawerState)

                Spacer(modifier = Modifier.height(160.dp))

                Text(
                    text = "Version 1.0.0",
                    fontSize = 16.sp
                )
            }
        }
    }
}
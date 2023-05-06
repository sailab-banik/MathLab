package com.sailab.mathlab.feature_home.presentation.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.sailab.mathlab.core.presentation.search.Search

@Composable
fun HomeScreen() {
    Column(
        modifier = Modifier.fillMaxSize(),
    ) {
        Search()
    }
}
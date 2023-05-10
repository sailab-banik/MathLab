@file:OptIn(ExperimentalMaterial3Api::class)

package com.sailab.mathlab

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.snapshotFlow
import androidx.compose.ui.Modifier
import com.sailab.mathlab.core.presentation.main_screen.MainScreen
import com.sailab.mathlab.ui.theme.MathLabTheme
import kotlinx.coroutines.FlowPreview
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.flow.debounce

@FlowPreview
@OptIn(ExperimentalMaterial3Api::class)
class MainActivity : ComponentActivity() {

    private val prefs by lazy {
        applicationContext.getSharedPreferences("prefs", MODE_PRIVATE)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val scrollPosition = prefs.getInt("scroll_position", 0)
        setContent {
            MathLabTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val lazyListState = rememberLazyListState(
                        initialFirstVisibleItemIndex = scrollPosition
                    )

                    LaunchedEffect(lazyListState) {
                        snapshotFlow {
                            lazyListState.firstVisibleItemIndex
                        }
                            .debounce(500L)
                            .collectLatest { index ->
                                prefs.edit()
                                    .putInt("scroll_position", index)
                                    .apply()
                            }
                    }
                    MainScreen(
                        context = applicationContext,
                        lazyListState = lazyListState
                    )
                }
            }
        }
    }
}
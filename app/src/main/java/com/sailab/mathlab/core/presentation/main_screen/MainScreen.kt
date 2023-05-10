package com.sailab.mathlab.core.presentation.main_screen

import android.annotation.SuppressLint
import android.content.Context
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Notes
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.sailab.mathlab.core.presentation.about.AboutScreen
import com.sailab.mathlab.core.presentation.main_screen.components.DrawerContent
import com.sailab.mathlab.core.presentation.main_screen.components.Screens
import com.sailab.mathlab.core.service.NotificationService
import com.sailab.mathlab.feature_calculator.presentation.coding.CodingCalculator
import com.sailab.mathlab.feature_calculator.presentation.general.GeneralCalculator
import com.sailab.mathlab.feature_calculator.presentation.scanner.ScannerScreen
import com.sailab.mathlab.feature_calculator.presentation.scientific.ScientificCalculator
import com.sailab.mathlab.feature_calculator.presentation.converter.ConverterScreen
import com.sailab.mathlab.feature_home.presentation.home.HomeScreen
import com.sailab.mathlab.feature_notes.presentation.notes.NotesScreen
import kotlinx.coroutines.launch

@ExperimentalMaterial3Api
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun MainScreen(
    context: Context,
    lazyListState: LazyListState
) {
    val scrollBehavior = TopAppBarDefaults.pinnedScrollBehavior()
    val drawerState = rememberDrawerState(DrawerValue.Closed)
    val scope = rememberCoroutineScope()
    val navController = rememberNavController()
    val service = NotificationService(context)

    service.showNotification()

    ModalNavigationDrawer(
        drawerState = drawerState,
        drawerContent = {
            DrawerContent(navController,drawerState)
        }
    ) {
        Scaffold(
            modifier = Modifier.nestedScroll(scrollBehavior.nestedScrollConnection),
            topBar = {
                SmallTopAppBar(
                    modifier = Modifier.padding(horizontal = 2.dp),
                    scrollBehavior = scrollBehavior,
                    title = {
                        Text(
                            text = "",
                            maxLines = 1,
                            overflow = TextOverflow.Ellipsis
                        )
                    },
                    navigationIcon = {
                        IconButton(onClick = {

                            if (drawerState.isClosed) {
                                scope.launch {
                                    drawerState.open()
                                }
                            } else {
                                scope.launch {
                                    drawerState.close()
                                }
                            }
                        }) {
                            Icon(
                                imageVector = Icons.Filled.Notes,
                                contentDescription = "Menu Icon"
                            )
                        }
                    },
                    actions = {
                        IconButton(
                            onClick = {

                        }) {
                            Icon(
                                imageVector = Icons.Filled.Notifications,
                                contentDescription = "Notification Icon"
                            )
                        }
                    }
                )
            }
        ) {
            Box(
                modifier = Modifier.padding(it)
            ) {
                NavHost(
                    navController = navController,
                    startDestination = Screens.HomeScreen.route
                ) {
                    composable(route = Screens.HomeScreen.route) {
                        HomeScreen(
                            navController = navController,
                            lazyListState = lazyListState
                        )
                    }
                    composable(route = Screens.GeneralCalculatorScreen.route) {
                        GeneralCalculator()
                    }
                    composable(route = Screens.ScientificCalculatorScreen.route) {
                        ScientificCalculator()
                    }
                    composable(route = Screens.CodingCalculatorScreen.route) {
                        CodingCalculator()
                    }
                    composable(route = Screens.ScannerScreen.route) {
                        ScannerScreen()
                    }
                    composable(route = Screens.ConverterScreen.route) {
                        ConverterScreen()
                    }
                    composable(route = Screens.AboutScreen.route) {
                        AboutScreen()
                    }
                    composable(route = Screens.NotesScreen.route) {
                        NotesScreen()
                    }
                }
            }
        }
    }
}
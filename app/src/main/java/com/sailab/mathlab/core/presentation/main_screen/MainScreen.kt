package com.sailab.mathlab.core.presentation.main_screen

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.text.style.TextOverflow
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.sailab.mathlab.core.presentation.about.AboutScreen
import com.sailab.mathlab.core.presentation.main_screen.components.DrawerContent
import com.sailab.mathlab.core.presentation.main_screen.components.Screens
import com.sailab.mathlab.feature_calculator.presentation.calculator.GeneralCalculator
import com.sailab.mathlab.feature_calculator.presentation.calculator.ScientificCalculator
import com.sailab.mathlab.feature_draw.presentation.draw.DrawScreen
import com.sailab.mathlab.feature_home.presentation.home.HomeScreen
import com.sailab.mathlab.feature_notes.presentation.notes.NotesScreen
import com.sailab.mathlab.feature_programmer_calculator.presentation.programmer.ProgrammerCalculator
import com.sailab.mathlab.feature_scanner.presentation.scanner.ScannerScreen
import kotlinx.coroutines.launch

@ExperimentalMaterial3Api
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun MainScreen() {
    val scrollBehavior = TopAppBarDefaults.pinnedScrollBehavior()
    val drawerState = rememberDrawerState(DrawerValue.Closed)
    val scope = rememberCoroutineScope()
    val navController = rememberNavController()

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
                    scrollBehavior = scrollBehavior,
                    title = {
                        Text(
                            text = "MathLab",
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
                                imageVector = Icons.Filled.Menu,
                                contentDescription = "Menu Icon"
                            )
                        }
                    },
                    actions = {
                        IconButton(onClick = { /* doSomething() */ }) {
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
                        HomeScreen()
                    }
                    composable(route = Screens.GeneralCalculatorScreen.route) {
                        GeneralCalculator()
                    }
                    composable(route = Screens.ScientificCalculatorScreen.route) {
                        ScientificCalculator()
                    }
                    composable(route = Screens.ProgrammerCalculatorScreen.route) {
                        ProgrammerCalculator()
                    }
                    composable(route = Screens.ScannerScreen.route) {
                        ScannerScreen()
                    }
                    composable(route = Screens.DrawScreen.route) {
                        DrawScreen()
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
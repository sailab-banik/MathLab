package com.sailab.mathlab.core.presentation.main_screen.components

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.navOptions
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NavigationDrawerItems(
    navController: NavHostController,
    drawerState: DrawerState
) {
    val scope = rememberCoroutineScope()
    val currentBackStackEntryAsState = navController.currentBackStackEntryAsState()
    val destination = currentBackStackEntryAsState.value?.destination

    NavigationDrawerItem(
        icon = {
            Icon(
                imageVector = Icons.Filled.Home,
                contentDescription = "Home Icon"
            )
        },
        label = {
            Text(
                text = "Home"
            )
        },
        selected = destination?.route == Screens.HomeScreen.route,
        onClick = {
            navController.navigate(
                Screens.HomeScreen.route,
                navOptions {
                    popUpTo(Screens.HomeScreen.route) {
                        saveState = true
                    }
                this.launchSingleTop = true
                this.restoreState = true
            })
            scope.launch {
                drawerState.close()
            }
        },
        modifier = Modifier.padding(NavigationDrawerItemDefaults.ItemPadding)
    )

    Spacer(modifier = Modifier.height(10.dp))

    NavigationDrawerItem(
        icon = {
            Icon(
                imageVector = Icons.Default.Calculate,
                contentDescription = "General Calculator"
            )
        },
        label = { Text(text = "General Calculator") },
        selected = destination?.route == Screens.GeneralCalculatorScreen.route,

        onClick = {
            navController.navigate(Screens.GeneralCalculatorScreen.route, navOptions {
                popUpTo(Screens.HomeScreen.route) {
                    saveState = true
                }
                this.launchSingleTop = true
                this.restoreState = true

            })
            scope.launch {
                drawerState.close()
            }
        },
        modifier = Modifier.padding(NavigationDrawerItemDefaults.ItemPadding)
    )

    Spacer(modifier = Modifier.height(10.dp))

    NavigationDrawerItem(
        icon = {
            Icon(
                imageVector = Icons.Default.Science,
                contentDescription = "Scientific Calculator"
            )
        },
        label = { Text(text = "Scientific Calculator") },
        selected = destination?.route == Screens.ScientificCalculatorScreen.route,

        onClick = {
            navController.navigate(Screens.ScientificCalculatorScreen.route, navOptions {
                popUpTo(Screens.HomeScreen.route) {
                    saveState = true
                }
                this.launchSingleTop = true
                this.restoreState = true

            })
            scope.launch {
                drawerState.close()
            }
        },
        modifier = Modifier.padding(NavigationDrawerItemDefaults.ItemPadding)
    )

    Spacer(modifier = Modifier.height(10.dp))

    NavigationDrawerItem(
        icon = {
            Icon(
                imageVector = Icons.Default.Code,
                contentDescription = "Programmer Calculator"
            )
        },
        label = { Text(text = "Programmer Calculator") },
        selected = destination?.route == Screens.ProgrammerCalculatorScreen.route,

        onClick = {
            navController.navigate(Screens.ProgrammerCalculatorScreen.route, navOptions {
                popUpTo(Screens.HomeScreen.route) {
                    saveState = true
                }
                this.launchSingleTop = true
                this.restoreState = true

            })
            scope.launch {
                drawerState.close()
            }
        },
        modifier = Modifier.padding(NavigationDrawerItemDefaults.ItemPadding)
    )

    Spacer(modifier = Modifier.height(10.dp))

    NavigationDrawerItem(
        icon = {
            Icon(
                imageVector = Icons.Default.PhotoCamera,
                contentDescription = "Scanner"
            )
        },
        label = { Text(text = "Scanner") },
        selected = destination?.route == Screens.ScannerScreen.route,

        onClick = {
            navController.navigate(Screens.ScannerScreen.route, navOptions {
                popUpTo(Screens.HomeScreen.route) {
                    saveState = true
                }
                this.launchSingleTop = true
                this.restoreState = true

            })
            scope.launch {
                drawerState.close()
            }
        },
        modifier = Modifier.padding(NavigationDrawerItemDefaults.ItemPadding)
    )

    Spacer(modifier = Modifier.height(10.dp))

    NavigationDrawerItem(
        icon = {
            Icon(
                imageVector = Icons.Default.Gesture,
                contentDescription = "Draw"
            )
        },
        label = { Text(text = "Draw") },
        selected = destination?.route == Screens.DrawScreen.route,

        onClick = {
            navController.navigate(Screens.DrawScreen.route, navOptions {
                popUpTo(Screens.HomeScreen.route) {
                    saveState = true
                }
                this.launchSingleTop = true
                this.restoreState = true

            })
            scope.launch {
                drawerState.close()
            }
        },
        modifier = Modifier.padding(NavigationDrawerItemDefaults.ItemPadding)
    )

    Spacer(modifier = Modifier.height(10.dp))

    NavigationDrawerItem(
        icon = {
            Icon(
                imageVector = Icons.Default.Note,
                contentDescription = "Notes"
            )
        },
        label = { Text(text = "Notes") },
        selected = destination?.route == Screens.NotesScreen.route,

        onClick = {
            navController.navigate(Screens.NotesScreen.route, navOptions {
                popUpTo(Screens.HomeScreen.route) {
                    saveState = true
                }
                this.launchSingleTop = true
                this.restoreState = true

            })
            scope.launch {
                drawerState.close()
            }
        },
        modifier = Modifier.padding(NavigationDrawerItemDefaults.ItemPadding)
    )

    Spacer(modifier = Modifier.height(10.dp))

    NavigationDrawerItem(
        icon = {
            Icon(
                imageVector = Icons.Default.Info,
                contentDescription = "About"
            )
        },
        label = { Text(text = "About") },
        selected = destination?.route == Screens.AboutScreen.route,

        onClick = {
            navController.navigate(Screens.AboutScreen.route, navOptions {
                popUpTo(Screens.HomeScreen.route) {
                    saveState = true
                }
                this.launchSingleTop = true
                this.restoreState = true

            })
            scope.launch {
                drawerState.close()
            }
        },
        modifier = Modifier.padding(NavigationDrawerItemDefaults.ItemPadding)
    )
}
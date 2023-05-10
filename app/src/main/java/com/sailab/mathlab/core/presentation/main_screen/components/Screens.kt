package com.sailab.mathlab.core.presentation.main_screen.components

sealed class Screens(val route: String) {
    object HomeScreen: Screens("home_screen")
    object GeneralCalculatorScreen: Screens("general_calculator")
    object ScientificCalculatorScreen: Screens("scientific_calculator")
    object CodingCalculatorScreen: Screens("coding_calculator")
    object ScannerScreen: Screens("scanner_screen")
    object ConverterScreen: Screens("converter_screen")
    object AboutScreen: Screens("about_screen")
    object NotesScreen: Screens("notes_screen")
}

package com.sailab.mathlab.feature_calculator.presentation.converter

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.sailab.mathlab.feature_calculator.domain.util.CalculatorAction
import com.sailab.mathlab.feature_calculator.presentation.CalculatorViewModel
import com.sailab.mathlab.feature_calculator.presentation.components.CalculatorButton
import com.sailab.mathlab.feature_calculator.presentation.components.CalculatorTextField

@ExperimentalMaterial3Api
@Composable
fun ConverterScreen() {
    val viewModel = viewModel<CalculatorViewModel>()
    var text by remember { mutableStateOf("Celsius") }

    Column(modifier = Modifier.fillMaxSize()) {
        Text(
            text = "Temperature",
            modifier = Modifier.padding(start = 20.dp, bottom = 10.dp),
            fontSize = MaterialTheme.typography.headlineMedium.fontSize,
            fontWeight = FontWeight.Bold
        )

        Text(text = text, modifier = Modifier.padding(start = 20.dp, bottom = 10.dp))

        CalculatorTextField(minHeight = 240.dp, horizontalPadding = 20.dp)

        LazyVerticalGrid(
            columns = GridCells.Fixed(4),
            modifier = Modifier
                .padding(20.dp)
                .fillMaxSize(),
            verticalArrangement = Arrangement.spacedBy(16.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp),
            content = {

                item {
                    CalculatorButton(
                        symbol = "7",
                        color = ButtonDefaults.elevatedButtonColors(),
                        onClick = {
                            viewModel.onAction(CalculatorAction.Number(7))
                        }
                    )
                }

                item {
                    CalculatorButton(
                        symbol = "8",
                        color = ButtonDefaults.elevatedButtonColors(),
                        onClick = {
                            viewModel.onAction(CalculatorAction.Number(8))
                        }
                    )
                }

                item {
                    CalculatorButton(
                        symbol = "9",
                        color = ButtonDefaults.elevatedButtonColors(),
                        onClick = {
                            viewModel.onAction(CalculatorAction.Number(9))
                        }
                    )
                }

                item {
                    CalculatorButton(
                        symbol = "Del",
                        color = ButtonDefaults.elevatedButtonColors(
                            MaterialTheme.colorScheme.errorContainer
                        ),
                        onClick = {
                            viewModel.onAction(CalculatorAction.Delete)
                        }
                    )
                }

                item {
                    CalculatorButton(
                        symbol = "4",
                        color = ButtonDefaults.elevatedButtonColors(),
                        onClick = {
                            viewModel.onAction(CalculatorAction.Number(4))
                        }
                    )
                }

                item {
                    CalculatorButton(
                        symbol = "5",
                        color = ButtonDefaults.elevatedButtonColors(),
                        onClick = {
                            viewModel.onAction(CalculatorAction.Number(5))
                        }
                    )
                }

                item {
                    CalculatorButton(
                        symbol = "6",
                        color = ButtonDefaults.elevatedButtonColors(),
                        onClick = {
                            viewModel.onAction(CalculatorAction.Number(6))
                        }
                    )
                }

                item {
                    CalculatorButton(
                        symbol = "AC",
                        color = ButtonDefaults.elevatedButtonColors(
                            MaterialTheme.colorScheme.errorContainer
                        ),
                        onClick = {
                            viewModel.onAction(CalculatorAction.Clear)
                        }
                    )
                }


                item {
                    CalculatorButton(
                        symbol = "1",
                        color = ButtonDefaults.elevatedButtonColors(),
                        onClick = {
                            viewModel.onAction(CalculatorAction.Number(1))
                        }
                    )
                }

                item {
                    CalculatorButton(
                        symbol = "2",
                        color = ButtonDefaults.elevatedButtonColors(),
                        onClick = {
                            viewModel.onAction(CalculatorAction.Number(2))
                        }
                    )
                }

                item {
                    CalculatorButton(
                        symbol = "3",
                        color = ButtonDefaults.elevatedButtonColors(),
                        onClick = {
                            viewModel.onAction(CalculatorAction.Number(3))
                        }
                    )
                }

                item {
                    CalculatorButton(
                        enable = text == "Celsius",
                        symbol = "F",
                        color = ButtonDefaults.elevatedButtonColors(
                            MaterialTheme.colorScheme.errorContainer
                        ),
                        onClick = {
                            viewModel.onAction(CalculatorAction.ConvertToFahr)
                            text = "Fahrenheit"
                        }
                    )
                }

                item {
                    CalculatorButton(
                        symbol = "+/-",
                        color = ButtonDefaults.elevatedButtonColors(),
                        onClick = {
                            viewModel.onAction(CalculatorAction.PlusMinus)
                        }
                    )
                }

                item {
                    CalculatorButton(
                        symbol = "0",
                        color = ButtonDefaults.elevatedButtonColors(),
                        onClick = {
                            viewModel.onAction(CalculatorAction.Number(0))
                        }
                    )
                }

                item {
                    CalculatorButton(
                        symbol = ".",
                        color = ButtonDefaults.elevatedButtonColors(),
                        onClick = {
                            viewModel.onAction(CalculatorAction.Decimal)
                        }
                    )
                }

                item {
                    CalculatorButton(
                        enable = text == "Fahrenheit",
                        symbol = "C",
                        color = ButtonDefaults.elevatedButtonColors(
                            MaterialTheme.colorScheme.errorContainer
                        ),
                        onClick = {
                            viewModel.onAction(CalculatorAction.ConvertToCel)
                            text = "Celsius"
                        }
                    )
                }
            }
        )
    }
}
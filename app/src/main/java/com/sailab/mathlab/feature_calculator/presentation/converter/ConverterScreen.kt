package com.sailab.mathlab.feature_calculator.presentation.converter

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.sailab.mathlab.feature_calculator.data.repository.CalculatorViewModel
import com.sailab.mathlab.feature_calculator.domain.util.CalculatorAction
import com.sailab.mathlab.feature_calculator.domain.util.CalculatorOperation
import com.sailab.mathlab.feature_calculator.presentation.components.CalculatorButton
import com.sailab.mathlab.feature_calculator.presentation.components.CalculatorTextField
import com.sailab.mathlab.feature_calculator.presentation.components.ConverterRadioButtons
import com.sailab.mathlab.feature_calculator.presentation.components.DropDown

@ExperimentalMaterial3Api
@Composable
fun ConverterScreen() {
    val viewModel = viewModel<CalculatorViewModel>()
    Column(modifier = Modifier.fillMaxSize()) {
        ConverterRadioButtons()

        DropDown()

        CalculatorTextField(minHeight = 32.dp, horizontalPadding = 20.dp)

        DropDown()

        CalculatorTextField(minHeight = 32.dp, horizontalPadding = 20.dp)

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
                        symbol = "↑",
                        color = ButtonDefaults.elevatedButtonColors(
                            MaterialTheme.colorScheme.errorContainer
                        ),
                        onClick = {
                            //viewModel.onAction(CalculatorAction.Operation(CalculatorOperation.Add))
                        }
                    )
                }

                item {
                    CalculatorButton(
                        symbol = "+/-",
                        color = ButtonDefaults.elevatedButtonColors(),
                        onClick = {
                            viewModel.onAction(CalculatorAction.Operation(CalculatorOperation.Subtract))
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
                        symbol = "↓",
                        color = ButtonDefaults.elevatedButtonColors(
                            MaterialTheme.colorScheme.errorContainer
                        ),
                        onClick = {
                            //viewModel.onAction(CalculatorAction.Calculate)
                        }
                    )
                }
            }
        )
    }
}
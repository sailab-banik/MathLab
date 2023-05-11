package com.sailab.mathlab.feature_calculator.presentation.scientific

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.sailab.mathlab.feature_calculator.domain.repository.CalculatorViewModel
import com.sailab.mathlab.feature_calculator.domain.util.CalculatorAction
import com.sailab.mathlab.feature_calculator.domain.util.CalculatorOperation
import com.sailab.mathlab.feature_calculator.presentation.components.CalculatorButton
import com.sailab.mathlab.feature_calculator.presentation.components.CalculatorTextField

@ExperimentalMaterial3Api
@Composable
fun ScientificCalculator() {
    val viewModel = viewModel<CalculatorViewModel>()

    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        CalculatorTextField(
            minHeight = 154.dp,
            horizontalPadding = 10.dp
        )

        LazyVerticalGrid(
            columns = GridCells.Fixed(5),
            modifier = Modifier
                .padding(
                    horizontal = 4.dp,
                    vertical = 16.dp
                )
                .fillMaxSize(),
            verticalArrangement = Arrangement.spacedBy(12.dp),
            horizontalArrangement = Arrangement.spacedBy(4.dp),
            content = {
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
                        symbol = "π",
                        color = ButtonDefaults.elevatedButtonColors(
                            MaterialTheme.colorScheme.errorContainer
                        ),
                        onClick = {
                            //viewModel.onAction(CalculatorAction.Delete)
                        }
                    )
                }

                item {
                    CalculatorButton(
                        symbol = "e",
                        color = ButtonDefaults.elevatedButtonColors(
                            MaterialTheme.colorScheme.errorContainer
                        ),
                        onClick = {
                            //viewModel.onAction(CalculatorAction.Delete)
                        }
                    )
                }

                item {
                    CalculatorButton(
                        symbol = "%",
                        color = ButtonDefaults.elevatedButtonColors(
                            MaterialTheme.colorScheme.errorContainer
                        ),
                        onClick = {
                            viewModel.onAction(CalculatorAction.Operation(CalculatorOperation.Percentage))
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
                        symbol = "sin",
                        color = ButtonDefaults.elevatedButtonColors(),
                        onClick = {
                            //viewModel.onAction(CalculatorAction.Number(7))
                        }
                    )
                }

                item {
                    CalculatorButton(
                        symbol = "x",
                        superScript = "y",
                        color = ButtonDefaults.elevatedButtonColors(),
                        onClick = {
                            //viewModel.onAction(CalculatorAction.Number(7))
                        }
                    )
                }

                item {
                    CalculatorButton(
                        symbol = "x",
                        superScript = "2",
                        color = ButtonDefaults.elevatedButtonColors(),
                        onClick = {
                            //viewModel.onAction(CalculatorAction.Number(7))
                        }
                    )
                }

                item {
                    CalculatorButton(
                        symbol = "√",
                        color = ButtonDefaults.elevatedButtonColors(),
                        onClick = {
                            //viewModel.onAction(CalculatorAction.Number(7))
                        }
                    )
                }

                item {
                    CalculatorButton(
                        symbol = "÷",
                        color = ButtonDefaults.elevatedButtonColors(
                            MaterialTheme.colorScheme.errorContainer
                        ),
                        onClick = {
                            viewModel.onAction(CalculatorAction.Operation(CalculatorOperation.Divide))
                        }
                    )
                }

                item {
                    CalculatorButton(
                        symbol = "cos",
                        color = ButtonDefaults.elevatedButtonColors(),
                        onClick = {
                            //viewModel.onAction(CalculatorAction.Number(7))
                        }
                    )
                }

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
                        symbol = "×",
                        color = ButtonDefaults.elevatedButtonColors(
                            MaterialTheme.colorScheme.errorContainer
                        ),
                        onClick = {
                            viewModel.onAction(CalculatorAction.Operation(CalculatorOperation.Multiply))
                        }
                    )
                }

                item {
                    CalculatorButton(
                        symbol = "tan",
                        color = ButtonDefaults.elevatedButtonColors(),
                        onClick = {
                            //viewModel.onAction(CalculatorAction.Number(4))
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
                        symbol = "-",
                        color = ButtonDefaults.elevatedButtonColors(
                            MaterialTheme.colorScheme.errorContainer
                        ),
                        onClick = {
                            viewModel.onAction(CalculatorAction.Operation(CalculatorOperation.Subtract))
                        }
                    )
                }

                item {
                    CalculatorButton(
                        symbol = "log",
                        color = ButtonDefaults.elevatedButtonColors(),
                        onClick = {
                            //viewModel.onAction(CalculatorAction.Number(7))
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
                        symbol = "+",
                        color = ButtonDefaults.elevatedButtonColors(
                            MaterialTheme.colorScheme.errorContainer
                        ),
                        onClick = {
                            viewModel.onAction(CalculatorAction.Operation(CalculatorOperation.Add))
                        }
                    )
                }

                item {
                    CalculatorButton(
                        symbol = "ln",
                        color = ButtonDefaults.elevatedButtonColors(),
                        onClick = {
                            //viewModel.onAction(CalculatorAction.Number(7))
                        }
                    )
                }

                item {
                    CalculatorButton(
                        symbol = "+/-",
                        color = ButtonDefaults.elevatedButtonColors(),
                        onClick = {
                            //viewModel.onAction(CalculatorAction.Operation(CalculatorOperation.Subtract))
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
                        symbol = "=",
                        color = ButtonDefaults.elevatedButtonColors(
                            MaterialTheme.colorScheme.errorContainer
                        ),
                        onClick = {
                            viewModel.onAction(CalculatorAction.Calculate)
                        }
                    )
                }
            }
        )
    }
}
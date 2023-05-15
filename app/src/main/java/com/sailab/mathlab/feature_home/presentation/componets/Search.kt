package com.sailab.mathlab.feature_home.presentation.componets

import android.content.Intent
import android.net.Uri
import android.widget.Toast
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardVoice
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.navOptions
import com.sailab.mathlab.util.Screens
import kotlinx.coroutines.launch

@Composable
fun Search(
    navController: NavController
) {
    val context = LocalContext.current
    val scope = rememberCoroutineScope()
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(
                horizontal = 12.dp,
                vertical = 8.dp
            )
    ) {
        var text by remember {
            mutableStateOf("")
        }

        TextField(
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(28.dp)),
            value = text,
            onValueChange = {
                text = it
            },
            singleLine = true,
            placeholder = {
                Text(text = "Search")
            },
            leadingIcon = {
                IconButton(onClick = {
                    when(text.lowercase()) {
                        in setOf("general calculator", "calculator", "general") -> navController.navigate(
                            Screens.GeneralCalculatorScreen.route,
                            navOptions {
                                popUpTo(Screens.HomeScreen.route) {
                                    saveState = true
                                }
                                this.launchSingleTop = true
                                this.restoreState = true
                            }
                        )

                        in setOf("coding", "coding calculator") -> navController.navigate(
                            Screens.CodingCalculatorScreen.route,
                            navOptions {
                                popUpTo(Screens.HomeScreen.route) {
                                    saveState = true
                                }
                                this.launchSingleTop = true
                                this.restoreState = true
                            }
                        )

                        in setOf("scientific", "scientific calculator") -> navController.navigate(
                            Screens.ScientificCalculatorScreen.route,
                            navOptions {
                                popUpTo(Screens.HomeScreen.route) {
                                    saveState = true
                                }
                                this.launchSingleTop = true
                                this.restoreState = true
                            }
                        )

                        in setOf("converter", "unit converter") -> navController.navigate(
                            Screens.ConverterScreen.route,
                            navOptions {
                                popUpTo(Screens.HomeScreen.route) {
                                    saveState = true
                                }
                                this.launchSingleTop = true
                                this.restoreState = true
                            }
                        )

                        in setOf("notes", "note") -> navController.navigate(
                            Screens.NotesScreen.route,
                            navOptions {
                                popUpTo(Screens.HomeScreen.route) {
                                    saveState = true
                                }
                                this.launchSingleTop = true
                                this.restoreState = true
                            }
                        )

                        in setOf("math magic ncert class 1", "ncert class 1", "class 1", "class1") -> {
                            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1jnqZZ7A8o5JoHEm2_bBpo0jkp8WZrgXV/view?usp=share_link"))
                            context.startActivity(intent)
                        }

                        in setOf("math magic ncert class 2", "ncert class 2", "class 2", "class2") -> {
                            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1VIklzzs87AMtx2XNqnw_QyLmRe875yqL/view?usp=share_link"))
                            context.startActivity(intent)
                        }

                        in setOf("math magic ncert class 3", "ncert class 3", "class 3", "class3") -> {
                            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1d8wF4L9x_yzyrSkYwnFQSUz2skrzOVf8/view?usp=share_link"))
                            context.startActivity(intent)
                        }

                        in setOf("math magic ncert class 4", "ncert class 4", "class 4", "class1") -> {
                            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1svAcL0ddAdFrP50YJDJNcNL1IWV5CBSa/view?usp=share_link"))
                            context.startActivity(intent)
                        }

                        in setOf("math magic ncert class 5", "ncert class 5", "class 5", "class5") -> {
                            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1HNfMXn-YvYkDMHExBvvwJTlgPfLVov5M/view?usp=share_link"))
                            context.startActivity(intent)
                        }

                        in setOf("mathematics ncert class 6", "ncert class 6", "class 6", "class6") -> {
                            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1W51kx1uMvouGDtQ8RgLjQdUMgyc3TOuC/view?usp=share_link"))
                            context.startActivity(intent)
                        }

                        in setOf("mathematics ncert class 7", "ncert class 7", "class 7", "class7") -> {
                            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1W51kx1uMvouGDtQ8RgLjQdUMgyc3TOuC/view?usp=share_link"))
                            context.startActivity(intent)
                        }

                        in setOf("mathematics ncert class 8", "ncert class 8", "class 8", "class8") -> {
                            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1uRc2IO8IhjP-unBqL8K4sUt1Zsqx2i5u/view?usp=share_link"))
                            context.startActivity(intent)
                        }

                        in setOf("mathematics ncert class 9", "ncert class 9", "class 9", "class9") -> {
                            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1RgrLU2zdxyfSxiYJXCb4jCECLqeETIFN/view?usp=share_link"))
                            context.startActivity(intent)
                        }

                        in setOf("mathematics ncert class 10", "ncert class 10", "class 10", "class10") -> {
                            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1FU6VfIdtOCL4j0--MQm1VSnnJOd6y2HJ/view?usp=share_link"))
                            context.startActivity(intent)
                        }

                        in setOf("mathematics ncert class 11", "ncert class 11", "class 11", "class11") -> {
                            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/12aIAgoAHtAAx-p0Euv8BDd1GW4k8ayzm/view?usp=share_link"))
                            context.startActivity(intent)
                        }

                        in setOf("mathematics ncert class 12", "ncert class 12", "class 12", "class12") -> {
                            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1FS_uW9h_eTxvMCKVXiDEfyPB1wVoknTI/view?usp=share_link"))
                            context.startActivity(intent)
                        }

                        else -> scope.launch {
                            Toast.makeText(context, "Keyword not found", Toast.LENGTH_SHORT).show()
                        }
                    }
                }) {
                    Icon(
                        imageVector = Icons.Default.Search,
                        contentDescription = "Search"
                    )
                }
            },
            trailingIcon = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Default.KeyboardVoice,
                        contentDescription = "Voice")
                }
            },
            colors = TextFieldDefaults.textFieldColors(
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent
            ),
            keyboardOptions = KeyboardOptions(
                imeAction = ImeAction.Search
            ),
            keyboardActions = KeyboardActions(
                onSearch = {
                    when(text.lowercase()) {
                        in setOf("general calculator", "calculator", "general") -> navController.navigate(
                            Screens.GeneralCalculatorScreen.route,
                            navOptions {
                                popUpTo(Screens.HomeScreen.route) {
                                    saveState = true
                                }
                                this.launchSingleTop = true
                                this.restoreState = true
                            }
                        )

                        in setOf("coding", "coding calculator") -> navController.navigate(
                            Screens.CodingCalculatorScreen.route,
                            navOptions {
                                popUpTo(Screens.HomeScreen.route) {
                                    saveState = true
                                }
                                this.launchSingleTop = true
                                this.restoreState = true
                            }
                        )

                        in setOf("scientific", "scientific calculator") -> navController.navigate(
                            Screens.ScientificCalculatorScreen.route,
                            navOptions {
                                popUpTo(Screens.HomeScreen.route) {
                                    saveState = true
                                }
                                this.launchSingleTop = true
                                this.restoreState = true
                            }
                        )

                        in setOf("converter", "unit converter") -> navController.navigate(
                            Screens.ConverterScreen.route,
                            navOptions {
                                popUpTo(Screens.HomeScreen.route) {
                                    saveState = true
                                }
                                this.launchSingleTop = true
                                this.restoreState = true
                            }
                        )

                        in setOf("notes", "note") -> navController.navigate(
                            Screens.NotesScreen.route,
                            navOptions {
                                popUpTo(Screens.HomeScreen.route) {
                                    saveState = true
                                }
                                this.launchSingleTop = true
                                this.restoreState = true
                            }
                        )

                        in setOf("math magic ncert class 1", "ncert class 1", "class 1", "class1") -> {
                            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1jnqZZ7A8o5JoHEm2_bBpo0jkp8WZrgXV/view?usp=share_link"))
                            context.startActivity(intent)
                        }

                        in setOf("math magic ncert class 2", "ncert class 2", "class 2", "class2") -> {
                            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1VIklzzs87AMtx2XNqnw_QyLmRe875yqL/view?usp=share_link"))
                            context.startActivity(intent)
                        }

                        in setOf("math magic ncert class 3", "ncert class 3", "class 3", "class3") -> {
                            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1d8wF4L9x_yzyrSkYwnFQSUz2skrzOVf8/view?usp=share_link"))
                            context.startActivity(intent)
                        }

                        in setOf("math magic ncert class 4", "ncert class 4", "class 4", "class1") -> {
                            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1svAcL0ddAdFrP50YJDJNcNL1IWV5CBSa/view?usp=share_link"))
                            context.startActivity(intent)
                        }

                        in setOf("math magic ncert class 5", "ncert class 5", "class 5", "class5") -> {
                            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1HNfMXn-YvYkDMHExBvvwJTlgPfLVov5M/view?usp=share_link"))
                            context.startActivity(intent)
                        }

                        in setOf("mathematics ncert class 6", "ncert class 6", "class 6", "class6") -> {
                            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1W51kx1uMvouGDtQ8RgLjQdUMgyc3TOuC/view?usp=share_link"))
                            context.startActivity(intent)
                        }

                        in setOf("mathematics ncert class 7", "ncert class 7", "class 7", "class7") -> {
                            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1W51kx1uMvouGDtQ8RgLjQdUMgyc3TOuC/view?usp=share_link"))
                            context.startActivity(intent)
                        }

                        in setOf("mathematics ncert class 8", "ncert class 8", "class 8", "class8") -> {
                            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1uRc2IO8IhjP-unBqL8K4sUt1Zsqx2i5u/view?usp=share_link"))
                            context.startActivity(intent)
                        }

                        in setOf("mathematics ncert class 9", "ncert class 9", "class 9", "class9") -> {
                            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1RgrLU2zdxyfSxiYJXCb4jCECLqeETIFN/view?usp=share_link"))
                            context.startActivity(intent)
                        }

                        in setOf("mathematics ncert class 10", "ncert class 10", "class 10", "class10") -> {
                            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1FU6VfIdtOCL4j0--MQm1VSnnJOd6y2HJ/view?usp=share_link"))
                            context.startActivity(intent)
                        }

                        in setOf("mathematics ncert class 11", "ncert class 11", "class 11", "class11") -> {
                            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/12aIAgoAHtAAx-p0Euv8BDd1GW4k8ayzm/view?usp=share_link"))
                            context.startActivity(intent)
                        }

                        in setOf("mathematics ncert class 12", "ncert class 12", "class 12", "class12") -> {
                            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1FS_uW9h_eTxvMCKVXiDEfyPB1wVoknTI/view?usp=share_link"))
                            context.startActivity(intent)
                        }

                        else -> scope.launch {
                            Toast.makeText(context, "Keyword not found", Toast.LENGTH_SHORT).show()
                        }
                    }
                }
            )
        )
    }
}
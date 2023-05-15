package com.sailab.mathlab.feature_home.presentation.home


import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.sailab.mathlab.feature_home.presentation.componets.Search
import com.sailab.mathlab.feature_home.domain.repository.HomeBooksRepository
import com.sailab.mathlab.feature_home.domain.repository.MathematicianRepository
import com.sailab.mathlab.feature_home.domain.repository.ToolsRepository
import com.sailab.mathlab.feature_home.presentation.componets.*

@ExperimentalMaterial3Api
@Composable
fun HomeScreen(
    navController: NavController,
    lazyListState: LazyListState
) {

    val toolsRepository = ToolsRepository()
    val booksRepository = HomeBooksRepository()
    val mathematicianRepository = MathematicianRepository()

    val toolsData = toolsRepository.getToolsData()
    val booksData = booksRepository.getBooksData()
    val mathematiciansData = mathematicianRepository.getMathematicianData()

    LazyColumn(
        content = {
            item {
                Search()
            }

            item {
                HomeChips(navController = navController)
            }

            item {
                HeadingText(text = "Tools")
            }

            item {
                LazyRow(
                    modifier = Modifier
                        .padding(horizontal = 10.dp),
                    content = {
                        items(items = toolsData) {
                            ToolsItem(
                                tools = it,
                                navController= navController
                            )
                        }
                    }
                )
            }

            item {
                HeadingText(text = "Textbooks")
            }

            item {
                LazyRow(
                    state = lazyListState,
                    modifier = Modifier
                        .padding(horizontal = 10.dp),
                    content = {
                        items(items = booksData) {
                            HomeBooksItem(books = it)
                        }
                    }
                )
            }

            item {
                HeadingText(text = "Mathematicians")
            }

            item {
                LazyRow(
                    modifier = Modifier
                        .padding(horizontal = 10.dp),
                    content = {
                        items(items = mathematiciansData) {
                            MathematiciansItem(mathematicians = it)
                        }
                    }
                )
            }
        }
    )
}

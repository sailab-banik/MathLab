package com.sailab.mathlab.feature_home.presentation.home


import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.sailab.mathlab.core.presentation.search.Search
import com.sailab.mathlab.feature_home.domain.repository.HomeBooksRepository
import com.sailab.mathlab.feature_home.domain.repository.ToolsRepository
import com.sailab.mathlab.feature_home.presentation.componets.HeadingText
import com.sailab.mathlab.feature_home.presentation.componets.HomeBooksItem
import com.sailab.mathlab.feature_home.presentation.componets.HomeChips
import com.sailab.mathlab.feature_home.presentation.componets.ToolsItem

@ExperimentalMaterial3Api
@Composable
fun HomeScreen(
    navController: NavController
) {
    val toolsRepository = ToolsRepository()
    val booksRepository = HomeBooksRepository()

    val toolsData = toolsRepository.getToolsData()
    val booksData = booksRepository.getBooksData()

    LazyColumn(
        content = {
            item {
                Search()
            }

            item {
                HomeChips()
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
                    modifier = Modifier
                        .padding(horizontal = 10.dp),
                    content = {
                        items(items = booksData) {
                            HomeBooksItem(books = it)
                        }
                    }
                )
            }
        }
    )
}

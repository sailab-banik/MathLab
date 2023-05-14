package com.sailab.mathlab.feature_home.domain.repository

import com.sailab.mathlab.feature_home.domain.model.HomeBooks

class HomeBooksRepository {
    fun getBooksData(): List<HomeBooks> {
        return listOf(
            HomeBooks(
                title = "Math Magic",
                description = "NCERT Class 1",
                link = "https://drive.google.com/file/d/1jSH_yDpDT3rSbVjW4tNSK98zubVqKZUo/view?usp=share_link"
            ),

            HomeBooks(
                title = "Math Magic",
                description = "NCERT Class 2"
            ),

            HomeBooks(
                title = "Math Magic",
                description = "NCERT Class 3"
            ),

            HomeBooks(
                title = "Math Magic",
                description = "NCERT Class 4"
            ),

            HomeBooks(
                title = "Math Magic",
                description = "NCERT Class 5"
            ),

            HomeBooks(
                title = "Mathematics",
                description = "NCERT Class 6"
            ),

            HomeBooks(
                title = "Mathematics",
                description = "NCERT Class 7"
            ),

            HomeBooks(
                title = "Mathematics",
                description = "NCERT Class 8"
            ),

            HomeBooks(
                title = "Mathematics",
                description = "NCERT Class 9"
            ),

            HomeBooks(
                title = "Mathematics",
                description = "NCERT Class 10"
            ),

            HomeBooks(
                title = "Mathematics",
                description = "NCERT Class 11"
            ),

            HomeBooks(
                title = "Mathematics",
                description = "NCERT Class 12"
            )
        )
    }
}
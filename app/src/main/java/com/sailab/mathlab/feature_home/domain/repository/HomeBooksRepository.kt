package com.sailab.mathlab.feature_home.domain.repository

import com.sailab.mathlab.feature_home.domain.model.HomeBooks

class HomeBooksRepository {
    fun getBooksData(): List<HomeBooks> {
        return listOf(
            HomeBooks(
                title = "Math Magic",
                description = "NCERT Class 1",
                link = "https://drive.google.com/file/d/1jnqZZ7A8o5JoHEm2_bBpo0jkp8WZrgXV/view?usp=share_link"
            ),

            HomeBooks(
                title = "Math Magic",
                description = "NCERT Class 2",
                link = "https://drive.google.com/file/d/1VIklzzs87AMtx2XNqnw_QyLmRe875yqL/view?usp=share_link"
            ),

            HomeBooks(
                title = "Math Magic",
                description = "NCERT Class 3",
                link = "https://drive.google.com/file/d/1d8wF4L9x_yzyrSkYwnFQSUz2skrzOVf8/view?usp=share_link"
            ),

            HomeBooks(
                title = "Math Magic",
                description = "NCERT Class 4",
                link = "https://drive.google.com/file/d/1svAcL0ddAdFrP50YJDJNcNL1IWV5CBSa/view?usp=share_link"
            ),

            HomeBooks(
                title = "Math Magic",
                description = "NCERT Class 5",
                link = "https://drive.google.com/file/d/1HNfMXn-YvYkDMHExBvvwJTlgPfLVov5M/view?usp=share_link"
            ),

            HomeBooks(
                title = "Mathematics",
                description = "NCERT Class 6",
                link = "https://drive.google.com/file/d/1A6xxlyF1zvhg2jLBVH9ePUflwcCJGBhx/view?usp=share_link"
            ),

            HomeBooks(
                title = "Mathematics",
                description = "NCERT Class 7",
                link = "https://drive.google.com/file/d/1A6xxlyF1zvhg2jLBVH9ePUflwcCJGBhx/view?usp=share_link"
            ),

            HomeBooks(
                title = "Mathematics",
                description = "NCERT Class 8",
                link = "https://drive.google.com/file/d/1uRc2IO8IhjP-unBqL8K4sUt1Zsqx2i5u/view?usp=share_link"
            ),

            HomeBooks(
                title = "Mathematics",
                description = "NCERT Class 9",
                link = "https://drive.google.com/file/d/1RgrLU2zdxyfSxiYJXCb4jCECLqeETIFN/view?usp=share_link"
            ),

            HomeBooks(
                title = "Mathematics",
                description = "NCERT Class 10",
                link = "https://drive.google.com/file/d/1FU6VfIdtOCL4j0--MQm1VSnnJOd6y2HJ/view?usp=share_link"
            ),

            HomeBooks(
                title = "Mathematics",
                description = "NCERT Class 11",
                link = "https://drive.google.com/file/d/12aIAgoAHtAAx-p0Euv8BDd1GW4k8ayzm/view?usp=share_link"
            ),

            HomeBooks(
                title = "Mathematics",
                description = "NCERT Class 12",
                link = "https://drive.google.com/file/d/1FS_uW9h_eTxvMCKVXiDEfyPB1wVoknTI/view?usp=share_link"
            )
        )
    }
}
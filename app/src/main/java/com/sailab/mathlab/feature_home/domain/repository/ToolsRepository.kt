package com.sailab.mathlab.feature_home.domain.repository

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import com.sailab.mathlab.feature_home.domain.model.Tools

class ToolsRepository {
    fun getToolsData(): List<Tools> {
        return listOf(
            Tools(
                title = "Notes",
                icon = Icons.Default.StickyNote2
            ),

            Tools(
                title = "Coding Calculator",
                icon = Icons.Default.Code
            ),

            Tools(
                title = "General Calculator",
                icon = Icons.Default.Calculate
            ),

            Tools(
                title = "Scientific Calculator",
                icon = Icons.Default.Science
            ),

            Tools(
                title = "Scanner",
                icon = Icons.Default.PhotoCamera
            ),

            Tools(
                title = "Converter",
                icon = Icons.Default.ChangeCircle
            )
        )
    }
}
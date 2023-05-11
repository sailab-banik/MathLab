package com.sailab.mathlab.feature_notes.domain.model

import androidx.compose.ui.graphics.Color
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.sailab.mathlab.ui.theme.*

@Entity
data class Note(
    val title: String,
    val content: String,
    val timestamp: Long,
    val color: Int,
    @PrimaryKey val id: Int? = null
) {
    companion object {
        val noteColors = listOf(
            md_theme_light_onSecondary,
            md_theme_light_outlineVariant,
            md_theme_light_errorContainer,
            Color.Yellow,
            Color.Green,
        )
    }
}

class InvalidNoteException(message: String): Exception(message)

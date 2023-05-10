package com.sailab.mathlab.core.domain.repository

import com.sailab.mathlab.R
import com.sailab.mathlab.core.domain.model.TechStack

class TechStackRepository {
    fun getTechStackData(): List<TechStack> {
        return listOf(
            TechStack(
                image = R.drawable.android_studio_logo,
                title = "Android Studio"
            ),

            TechStack(
                image = R.drawable.kotlin_logo,
                title = "Kotlin"
            ),

            TechStack(
                image = R.drawable.compose_img,
                title = "Jetpack Compose"
            ),

            TechStack(
                image = R.drawable.material3_logo,
                title = "Material 3"
            ),

            TechStack(
                image = R.drawable.coil_logo,
                title = "Coil"
            ),
        )
    }
}
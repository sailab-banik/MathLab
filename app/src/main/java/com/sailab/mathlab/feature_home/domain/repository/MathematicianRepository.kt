package com.sailab.mathlab.feature_home.domain.repository

import com.sailab.mathlab.R
import com.sailab.mathlab.feature_home.domain.model.Mathematicians

class MathematicianRepository {
    fun getMathematicianData(): List<Mathematicians> {
        return listOf(
            Mathematicians(
                image = R.drawable.ramanujan,
                title = "S Ramanujan"
            ),

            Mathematicians(
                image = R.drawable.pythagoras,
                title = "Pythagoras"
            ),

            Mathematicians(
                image = R.drawable.turing,
                title = "A Turing"
            ),

            Mathematicians(
                image = R.drawable.fibonacci,
                title = "Fibonacci"
            ),

            Mathematicians(
                image = R.drawable.sn_bose,
                title = "SN Bose"
            ),

            Mathematicians(
                image = R.drawable.gauss,
                title = "CF Gauss"
            ),

            Mathematicians(
                image = R.drawable.eular,
                title = "L Euler"
            ),

            Mathematicians(
                image = R.drawable.cantor,
                title = "G Cantor"
            ),

            Mathematicians(
                image = R.drawable.pc_mahanolobis,
                title = "PC Mahanolobis"
            ),

            Mathematicians(
                image = R.drawable.sakuntala_devi,
                title = "S Devi"
            ),
        )
    }
}
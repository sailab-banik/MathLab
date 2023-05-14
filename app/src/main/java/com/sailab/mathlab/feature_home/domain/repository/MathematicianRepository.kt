package com.sailab.mathlab.feature_home.domain.repository

import com.sailab.mathlab.R
import com.sailab.mathlab.feature_home.domain.model.Mathematicians

class MathematicianRepository {
    fun getMathematicianData(): List<Mathematicians> {
        return listOf(
            Mathematicians(
                image = R.drawable.ramanujan,
                title = "S Ramanujan",
                link = "https://en.wikipedia.org/wiki/Srinivasa_Ramanujan"
            ),

            Mathematicians(
                image = R.drawable.pythagoras,
                title = "Pythagoras",
                link = "https://en.wikipedia.org/wiki/Pythagoras"
            ),

            Mathematicians(
                image = R.drawable.turing,
                title = "A Turing",
                link = "https://en.wikipedia.org/wiki/Alan_Turing"
            ),

            Mathematicians(
                image = R.drawable.fibonacci,
                title = "Fibonacci",
                link = "https://en.wikipedia.org/wiki/Fibonacci"
            ),

            Mathematicians(
                image = R.drawable.sn_bose,
                title = "SN Bose",
                link = "https://en.wikipedia.org/wiki/Satyendra_Nath_Bose"
            ),

            Mathematicians(
                image = R.drawable.gauss,
                title = "CF Gauss",
                link = "https://en.wikipedia.org/wiki/Carl_Friedrich_Gauss"
            ),

            Mathematicians(
                image = R.drawable.eular,
                title = "L Euler",
                link = "https://en.wikipedia.org/wiki/Leonhard_Euler"
            ),

            Mathematicians(
                image = R.drawable.cantor,
                title = "G Cantor",
                link = "https://en.wikipedia.org/wiki/Georg_Cantor"
            ),

            Mathematicians(
                image = R.drawable.pc_mahanolobis,
                title = "PC Mahalanobis",
                link = "https://en.wikipedia.org/wiki/Prasanta_Chandra_Mahalanobis"
            ),

            Mathematicians(
                image = R.drawable.sakuntala_devi,
                title = "S Devi",
                link = "https://en.wikipedia.org/wiki/Shakuntala_Devi"
            ),
        )
    }
}
package com.example.surprise_eggs_store.data

import com.example.surprise_eggs_store.R
import com.example.surprise_eggs_store.data.model.Category
import com.example.surprise_eggs_store.data.model.Figure

class DataSource {

fun getFigures(): List<Category>{
    return listOf(
        Category(

        "Dinos",
        listOf(
            Figure(
                "Koktettino",
                R.drawable.dino1,
                5.25
            ),
            Figure(
                "Trampelino",
                R.drawable.dino2,
                8.25
            ),
            Figure(
                "Flammino",
                R.drawable.dino3,
                8.25
            ),
            Figure(
                "Däumelino",
                R.drawable.dino4,
                5.25
            ),
            Figure(
                "Bronto",
                R.drawable.dino5,
                8.25
            ),
            Figure(
                "Tranquillino",
                R.drawable.dino6,
                5.25
            ),
            Figure(
                "Hecktino",
                R.drawable.dino7,
                5.25
            ),
            Figure(
                "Melodino",
                R.drawable.dino8,
                8.25
            ),
            Figure(
                "Juwelina",
                R.drawable.dino9,
                8.25
            ),
            Figure(
                "Pauline Plaster",
                R.drawable.dino10,
                9.25
            ),
        )
    ),
        Category(
            "Hippos",
        listOf(
            Figure(
                "Emil Erbsenzähler",
                R.drawable.hippo1,
                7.35
            ),
            Figure(
                "Klara Klatschmaul",
                R.drawable.hippo2,
                5.35
            ),
            Figure(
                "Babsy Baby",
                R.drawable.hippo4,
                7.35
            ),
            Figure(
                "Susi Sonnenschein",
                R.drawable.hippo5,
                5.35
            ),
            Figure(
                "Guido Geistesblitz",
                R.drawable.hippo6,
                7.35
            ),
            Figure(
                "Pauly Pünklich",
                R.drawable.hippo7,
                5.35
            ),
            Figure(
                "Träumler Tommy",
                R.drawable.hippo9,
                7.35
            ),
            Figure(
                "Happy_Hippo Boss",
                R.drawable.hippo10,
                9.35
            )
        )
        ),
        Category(
            "Billy_Boy",
            listOf(
                Figure(
                    "Billy Blume",
                    R.drawable.bill_boy1,
                    9.25
                ),
                Figure(
                    "Billy Aufschlag",
                    R.drawable.bill_boy2,
                    9.25
                ),
                Figure(
                    "Billy Konditionswunder",
                    R.drawable.bill_boy3,
                    10.25
                ),
                Figure(
                    "Billy Badewannenchamp",
                    R.drawable.bill_boy4,
                    9.25
                ),
                Figure(
                    "Billy Rasenkuschler",
                    R.drawable.bill_boy5,
                    10.25
                ),
                Figure(
                    "Billy Plattfuss",
                    R.drawable.bill_boy6,
                    10.25
                ),
                Figure(
                    "Billy Body_Bill Ding",
                    R.drawable.bill_boy7,
                    9.25
                ),
                Figure(
                    "Billy Handicap",
                    R.drawable.bill_boy8,
                    10.25
                ),
                Figure(
                    "Billy Sessel_Libero",
                    R.drawable.bill_boy9,
                    9.25
                ),
                Figure(
                    "Billy Pokerface",
                    R.drawable.bill_boy10,
                    9.25

                )

            )
        )
    )
}

}
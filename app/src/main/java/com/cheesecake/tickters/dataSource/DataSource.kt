package com.cheesecake.tickters.dataSource

import com.cheesecake.tickters.dataSource.Entity.Movie
import com.cheesecake.tickters.dataSource.Entity.MovieType

object DataSource {

    val nowShowingMovies = listOf(
        Movie(
            "https://user-images.githubusercontent.com/90576202/250568264-101026cf-20f9-4f13-8235-b7674664ddc5.png",
            "Fantastic Beasts:The Secrets Of Dumbledore",
            listOf("Fantasy", "Adventure"),
            "2h 33m",
            MovieType.NOW_SHOWING,
            cast = listOf(
                "https://user-images.githubusercontent.com/90576202/250568264-101026cf-20f9-4f13-8235-b7674664ddc5.png",
                "https://user-images.githubusercontent.com/90576202/250568264-101026cf-20f9-4f13-8235-b7674664ddc5.png",
                "https://user-images.githubusercontent.com/90576202/250568264-101026cf-20f9-4f13-8235-b7674664ddc5.png",
                "https://user-images.githubusercontent.com/90576202/250568264-101026cf-20f9-4f13-8235-b7674664ddc5.png",
                "https://user-images.githubusercontent.com/90576202/250568264-101026cf-20f9-4f13-8235-b7674664ddc5.png",
                "https://user-images.githubusercontent.com/90576202/250568264-101026cf-20f9-4f13-8235-b7674664ddc5.png",
                "https://user-images.githubusercontent.com/90576202/250568264-101026cf-20f9-4f13-8235-b7674664ddc5.png",
                "https://user-images.githubusercontent.com/90576202/250568264-101026cf-20f9-4f13-8235-b7674664ddc5.png",
            )
        ),
        Movie(
            "https://upload.wikimedia.org/wikipedia/en/9/94/John_Wick_Chapter_3_Parabellum.png",
            "John Wick: Chapter 3 – Parabellum",
            listOf("Fantasy", "Action"),
            "1h 93m",
            MovieType.NOW_SHOWING,
            listOf(
                "https://upload.wikimedia.org/wikipedia/commons/3/33/Reuni%C3%A3o_com_o_ator_norte-americano_Keanu_Reeves_%2846806576944%29_%28cropped%29.jpg",
                "https://upload.wikimedia.org/wikipedia/commons/5/56/Halle_Berry_by_Gage_Skidmore_2.jpg",
                "https://upload.wikimedia.org/wikipedia/commons/8/85/National_Memorial_Day_Concert_2017_%2834117818524%29_%28cropped%29.jpg",
                "https://upload.wikimedia.org/wikipedia/commons/0/09/Meet_Taylor_Mason_%28Asia_Kate_Dillon%29_Billions_Season_2.jpg",
                "https://upload.wikimedia.org/wikipedia/commons/7/74/McShaneTamLinRio311022_%281_of_21%29_%2852470810951%29_%28cropped%29.jpg",
                "https://upload.wikimedia.org/wikipedia/commons/1/1f/Mark_Dacascos_cropped.jpg",
                "https://upload.wikimedia.org/wikipedia/commons/6/63/Anjelica_Huston_March_21%2C_2014_%28cropped%29.jpg",
                "https://upload.wikimedia.org/wikipedia/commons/5/5b/Lance_Reddick_by_Gage_Skidmore.jpg"
            )
        ),
        Movie(
            "https://upload.wikimedia.org/wikipedia/en/f/fc/Fight_Club_poster.jpg",
            "Fight Club",
            listOf("Fantasy", "Comedy"),
            "1h 93m",
            MovieType.NOW_SHOWING,
            listOf(
                "https://upload.wikimedia.org/wikipedia/en/f/fc/Fight_Club_poster.jpg",
                "https://upload.wikimedia.org/wikipedia/en/f/fc/Fight_Club_poster.jpg",
                "https://upload.wikimedia.org/wikipedia/en/f/fc/Fight_Club_poster.jpg",
                "https://upload.wikimedia.org/wikipedia/en/f/fc/Fight_Club_poster.jpg",
                "https://upload.wikimedia.org/wikipedia/en/f/fc/Fight_Club_poster.jpg",
                "https://upload.wikimedia.org/wikipedia/en/f/fc/Fight_Club_poster.jpg",
                "https://upload.wikimedia.org/wikipedia/en/f/fc/Fight_Club_poster.jpg",
                "https://upload.wikimedia.org/wikipedia/en/f/fc/Fight_Club_poster.jpg",
            )
        ),
    )

    val comingSoonMovies = listOf(
        Movie(
            "https://upload.wikimedia.org/wikipedia/en/f/f2/Fast_X_poster.jpg",
            "Fast X",
            listOf("Fantasy", "Action", "Comedy"),
            "3h 11m",
            MovieType.COMING_SOON,
            listOf(
                "https://upload.wikimedia.org/wikipedia/commons/8/83/Vin_Diesel_by_Gage_Skidmore_2.jpg",
                "https://upload.wikimedia.org/wikipedia/commons/2/22/Jason_Momoa_%2843055621224%29_%28cropped%29.jpg",
                "https://upload.wikimedia.org/wikipedia/commons/9/90/Lazer_Team_premiere_-_Alan_Ritchson_%2827161983270%29_%28cropped%29.jpg",
                "https://upload.wikimedia.org/wikipedia/commons/d/d3/Jason_Statham_2018.jpg",
                "https://upload.wikimedia.org/wikipedia/commons/6/60/John_Cena_July_2018.jpg",
                "https://upload.wikimedia.org/wikipedia/commons/1/1f/Dwayne_Johnson_2014_%28cropped%29.jpg",
                "https://upload.wikimedia.org/wikipedia/commons/f/fd/Michelle_Rodriguez_Cannes_2018_cropped.jpg",
                "https://upload.wikimedia.org/wikipedia/commons/2/2d/TyreseGibsonDec08.jpg",

                )
        ),
        Movie(
            "https://upload.wikimedia.org/wikipedia/en/b/b4/Spider-Man-_Across_the_Spider-Verse_poster.jpg",
            "Spider man across the spider verse",
            listOf("Fantasy", "Action", "Comedy"),
            "1h 93m",
            MovieType.COMING_SOON,
            listOf(
                "https://upload.wikimedia.org/wikipedia/en/b/b4/Spider-Man-_Across_the_Spider-Verse_poster.jpg",
                "https://upload.wikimedia.org/wikipedia/en/b/b4/Spider-Man-_Across_the_Spider-Verse_poster.jpg",
                "https://upload.wikimedia.org/wikipedia/en/b/b4/Spider-Man-_Across_the_Spider-Verse_poster.jpg",
                "https://upload.wikimedia.org/wikipedia/en/b/b4/Spider-Man-_Across_the_Spider-Verse_poster.jpg",
                "https://upload.wikimedia.org/wikipedia/en/b/b4/Spider-Man-_Across_the_Spider-Verse_poster.jpg",
                "https://upload.wikimedia.org/wikipedia/en/b/b4/Spider-Man-_Across_the_Spider-Verse_poster.jpg",
                "https://upload.wikimedia.org/wikipedia/en/b/b4/Spider-Man-_Across_the_Spider-Verse_poster.jpg",
                "https://upload.wikimedia.org/wikipedia/en/b/b4/Spider-Man-_Across_the_Spider-Verse_poster.jpg",
            )

        ),
        Movie(
            "https://upload.wikimedia.org/wikipedia/en/4/49/Shippudenkeyvisual.png",
            "Naruto",
            listOf("Anime", "Adventure"),
            "2h 33m",
            MovieType.COMING_SOON,
            listOf(
                "https://upload.wikimedia.org/wikipedia/en/4/49/Shippudenkeyvisual.png",
                "https://upload.wikimedia.org/wikipedia/en/4/49/Shippudenkeyvisual.png",
                "https://upload.wikimedia.org/wikipedia/en/4/49/Shippudenkeyvisual.png",
                "https://upload.wikimedia.org/wikipedia/en/4/49/Shippudenkeyvisual.png",
                "https://upload.wikimedia.org/wikipedia/en/4/49/Shippudenkeyvisual.png",
                "https://upload.wikimedia.org/wikipedia/en/4/49/Shippudenkeyvisual.png",
                "https://upload.wikimedia.org/wikipedia/en/4/49/Shippudenkeyvisual.png",
                "https://upload.wikimedia.org/wikipedia/en/4/49/Shippudenkeyvisual.png",
            )
        ),
    )

}
package com.cheesecake.tickters.repository

import com.cheesecake.tickters.viewmodel.model.Movie
import com.cheesecake.tickters.viewmodel.model.MovieType
import javax.inject.Inject

class MoviesRepositoryImpl @Inject constructor() : IMoviesRepository {

    override fun getNowShowingMovies() = listOf(
        Movie(
            "https://user-images.githubusercontent.com/90576202/250568264-101026cf-20f9-4f13-8235-b7674664ddc5.png",
            "Fantastic Beasts:The Secrets Of Dumbledore",
            listOf("Fantasy", "Adventure"),
            "2h 33m",
            MovieType.NOW_SHOWING
        ),
        Movie(
            "https://upload.wikimedia.org/wikipedia/en/9/94/John_Wick_Chapter_3_Parabellum.png",
            "John Wick: Chapter 3 – Parabellum",
            listOf("Fantasy", "Action"),
            "1h 93m",
            MovieType.NOW_SHOWING
        ),
        Movie(
            "https://upload.wikimedia.org/wikipedia/en/f/fc/Fight_Club_poster.jpg",
            "Fight Club",
            listOf("Fantasy", "Comedy"),
            "1h 93m",
            MovieType.NOW_SHOWING
        ),
    )

    override fun getComingSoonItems() = listOf(
        Movie(
            "https://upload.wikimedia.org/wikipedia/en/f/f2/Fast_X_poster.jpg",
            "Fast X",
            listOf("Fantasy", "Action", "Comedy"),
            "3h 11m",
            MovieType.COMING_SOON
        ),
        Movie(
            "https://upload.wikimedia.org/wikipedia/en/b/b4/Spider-Man-_Across_the_Spider-Verse_poster.jpg",
            "Spider man across the spider verse",
            listOf("Fantasy", "Action", "Comedy"),
            "1h 93m",
            MovieType.COMING_SOON

        ),
        Movie(
            "https://upload.wikimedia.org/wikipedia/en/4/49/Shippudenkeyvisual.png",
            "Naruto",
            listOf("Anime", "Adventure"),
            "2h 33m",
            MovieType.COMING_SOON
        ),
    )
}
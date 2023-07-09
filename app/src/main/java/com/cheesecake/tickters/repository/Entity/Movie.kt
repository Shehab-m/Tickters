package com.cheesecake.tickters.repository.Entity

data class Movie(
    val imageUrl: String,
    val title: String,
    val tags: List<String>,
    val duration: String,
    val type: MovieType,
    val cast: List<String>
)

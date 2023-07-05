package com.cheesecake.tickters.viewmodel.model

data class Movie(
    val imageUrl: String,
    val title: String,
    val tags: List<String>,
    val duration: String
)

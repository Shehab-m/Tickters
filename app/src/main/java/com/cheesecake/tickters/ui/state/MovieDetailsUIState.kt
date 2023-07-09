package com.cheesecake.tickters.ui.state

data class MovieDetailsUIState (
    val itemsCast: List<String> = emptyList(),
    val tags: List<String> = emptyList(),
    val title: String = "",
    val description: String = "",
    val imageUrl: String = "",
)
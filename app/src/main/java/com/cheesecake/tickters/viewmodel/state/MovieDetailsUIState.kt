package com.cheesecake.tickters.viewmodel.state

data class MovieDetailsUIState (
    val itemsCast: List<String> = emptyList(),
    val tags: List<String> = emptyList(),
    val name: String = "",
    val description: String = "",
    val imageUrl: String = "",
)
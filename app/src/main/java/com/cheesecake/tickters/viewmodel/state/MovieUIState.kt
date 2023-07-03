package com.cheesecake.tickters.viewmodel.state

data class MovieUIState (
    val items: List<String> = emptyList<String>(),
    val tags: List<String> = emptyList<String>(),
    val name: String = "",
    val description: String = "",
)
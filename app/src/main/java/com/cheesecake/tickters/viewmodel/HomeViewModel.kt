package com.cheesecake.tickters.viewmodel

import com.cheesecake.tickters.viewmodel.model.HomeContentType
import com.cheesecake.tickters.viewmodel.model.Movie
import com.cheesecake.tickters.viewmodel.state.HomeUIState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.update
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor() : BaseViewModel<HomeUIState>(HomeUIState()),
    HomeScreenInteractions {

    override fun updateHomeContent(selectedContent: HomeContentType) {
        _state.update {
            it.copy(
                homeContentType = selectedContent, movies = when (selectedContent) {
                    HomeContentType.ComingSoon -> comingSoonItems
                    HomeContentType.NowShowing -> nowShowingItems
                }
            )
        }
    }

    private val nowShowingItems = listOf(
        Movie(
            "https://user-images.githubusercontent.com/90576202/250568264-101026cf-20f9-4f13-8235-b7674664ddc5.png",
            "Fantastic Beasts:The Secrets Of Dumbledore",
            listOf("Fantasy", "Adventure"),
            "2h 33m",
        ),
        Movie(
            "https://upload.wikimedia.org/wikipedia/en/9/94/John_Wick_Chapter_3_Parabellum.png",
            "John Wick: Chapter 3 – Parabellum",
            listOf("Fantasy", "Action"),
            "1h 93m",
        ),
        Movie(
            "https://upload.wikimedia.org/wikipedia/en/f/fc/Fight_Club_poster.jpg",
            "Fight Club",
            listOf("Fantasy", "Comedy"),
            "1h 93m",
        ),
    )

    private val comingSoonItems = listOf(
        Movie(
            "https://upload.wikimedia.org/wikipedia/en/f/f2/Fast_X_poster.jpg",
            "Fast X",
            listOf("Fantasy", "Action", "Comedy"),
            "3h 11m",
        ),
        Movie(
            "https://upload.wikimedia.org/wikipedia/en/b/b4/Spider-Man-_Across_the_Spider-Verse_poster.jpg",
            "Spider man across the spider verse",
            listOf("Fantasy", "Action", "Comedy"),
            "1h 93m",
        ),
        Movie(
            "https://upload.wikimedia.org/wikipedia/en/4/49/Shippudenkeyvisual.png",
            "Naruto",
            listOf("Anime", "Adventure"),
            "2h 33m",
        ),
    )

    init {
        _state.update {
            it.copy(
                nowShowingItems
            )
        }
    }

}
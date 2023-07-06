package com.cheesecake.tickters.viewmodel

import com.cheesecake.tickters.viewmodel.model.Movie
import com.cheesecake.tickters.viewmodel.state.HomeUIState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.update
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor() : BaseViewModel<HomeUIState>(HomeUIState()) {

    init {
        _state.update {
            it.copy(
                listOf(
                    Movie(
                        "https://user-images.githubusercontent.com/90576202/250568264-101026cf-20f9-4f13-8235-b7674664ddc5.png",
                        "Fantastic Beasts:The Secrets Of Dumbledore",
                        listOf("Fantasy", "Adventure"),
                        "2h 33m",
                    ),
                    Movie(
                        "https://upload.wikimedia.org/wikipedia/en/b/b4/Spider-Man-_Across_the_Spider-Verse_poster.jpg",
                        "spider man across the spider verse",
                        listOf("Fantasy", "Action"),
                        "1h 93m",
                    ),
                    Movie(
                        "https://upload.wikimedia.org/wikipedia/en/f/ff/The_Batman_%28film%29_poster.jpg",
                        "the batman",
                        listOf("Action", "Comedy"),
                        "2h 33m",
                    ),
                    Movie(
                        "https://upload.wikimedia.org/wikipedia/en/f/fc/Fight_Club_poster.jpg",
                        "Fight Club",
                        listOf("Fantasy", "Comedy"),
                        "1h 93m",
                    ),
                )
            )
        }
    }

}
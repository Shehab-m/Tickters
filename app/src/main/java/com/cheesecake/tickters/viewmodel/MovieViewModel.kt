package com.cheesecake.tickters.viewmodel

import com.cheesecake.tickters.viewmodel.state.MovieUIState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.update

@HiltViewModel
class MovieViewModel : BaseViewModel<MovieUIState>(MovieUIState()) {
    private val items = listOf(
        "https://user-images.githubusercontent.com/90576202/250568264-101026cf-20f9-4f13-8235-b7674664ddc5.png",
        "https://user-images.githubusercontent.com/90576202/250568264-101026cf-20f9-4f13-8235-b7674664ddc5.png",
        "https://user-images.githubusercontent.com/90576202/250568264-101026cf-20f9-4f13-8235-b7674664ddc5.png",
        "https://user-images.githubusercontent.com/90576202/250568264-101026cf-20f9-4f13-8235-b7674664ddc5.png",
        "https://user-images.githubusercontent.com/90576202/250568264-101026cf-20f9-4f13-8235-b7674664ddc5.png",
        "https://user-images.githubusercontent.com/90576202/250568264-101026cf-20f9-4f13-8235-b7674664ddc5.png",
        "https://user-images.githubusercontent.com/90576202/250568264-101026cf-20f9-4f13-8235-b7674664ddc5.png",
        "https://user-images.githubusercontent.com/90576202/250568264-101026cf-20f9-4f13-8235-b7674664ddc5.png",
        "https://user-images.githubusercontent.com/90576202/250568264-101026cf-20f9-4f13-8235-b7674664ddc5.png",
    )

    private val tags = listOf("Fantasy", "Adventure")

    init {
        _state.update {
            it.copy(
                itemsCast = items,
                tags = tags,
                name = "Fantastic Beasts:The Secrets Of Dumbledore",
                description = "Professor Albus Dumbledore knows the powerful, dark wizard Gellert Grindelwald is moving to seize control of the wizarding world. Unable to stop him from",
                imageUrl = "https://user-images.githubusercontent.com/90576202/250568264-101026cf-20f9-4f13-8235-b7674664ddc5.png"
            )
        }
    }


}
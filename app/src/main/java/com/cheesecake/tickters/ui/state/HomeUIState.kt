package com.cheesecake.tickters.ui.state

import com.cheesecake.tickters.Entity.Movie
import com.cheesecake.tickters.ui.screens.Home.HomeContentType

data class HomeUIState(
    val movies: List<Movie> = emptyList(),
    val homeContentType: HomeContentType = HomeContentType.NowShowing,

    )

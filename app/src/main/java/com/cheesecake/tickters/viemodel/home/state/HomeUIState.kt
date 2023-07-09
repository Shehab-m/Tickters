package com.cheesecake.tickters.viemodel.home.state

import com.cheesecake.tickters.dataSource.Entity.Movie
import com.cheesecake.tickters.ui.screens.Home.HomeContentType

data class HomeUIState(
    val movies: List<Movie> = emptyList(),
    val homeContentType: HomeContentType = HomeContentType.NowShowing,
    )
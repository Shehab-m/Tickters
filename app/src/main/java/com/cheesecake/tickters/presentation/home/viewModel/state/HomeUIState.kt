package com.cheesecake.tickters.presentation.home.viewModel.state

import com.cheesecake.tickters.dataSource.Entity.Movie
import com.cheesecake.tickters.presentation.home.HomeContentType

data class HomeUIState(
    val movies: List<Movie> = emptyList(),
    val homeContentType: HomeContentType = HomeContentType.NowShowing,
    )

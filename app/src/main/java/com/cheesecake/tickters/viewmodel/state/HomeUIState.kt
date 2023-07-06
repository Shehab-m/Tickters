package com.cheesecake.tickters.viewmodel.state

import com.cheesecake.tickters.viewmodel.model.HomeContentType
import com.cheesecake.tickters.viewmodel.model.Movie

data class HomeUIState(
    val movies: List<Movie> = emptyList(),
    val homeContentType: HomeContentType = HomeContentType.NowShowing,

    )

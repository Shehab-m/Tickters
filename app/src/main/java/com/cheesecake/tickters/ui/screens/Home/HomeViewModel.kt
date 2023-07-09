package com.cheesecake.tickters.ui.screens.Home

import com.cheesecake.tickters.repository.IMoviesRepository
import com.cheesecake.tickters.base.BaseViewModel
import com.cheesecake.tickters.ui.screens.Home.state.HomeUIState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.update
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    repository: IMoviesRepository
) : BaseViewModel<HomeUIState>(HomeUIState()),
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

    private val nowShowingItems = repository.getNowShowingMovies()

    private val comingSoonItems = repository.getComingSoonItems()

    init {
        _state.update {
            it.copy(
                nowShowingItems
            )
        }
    }

}
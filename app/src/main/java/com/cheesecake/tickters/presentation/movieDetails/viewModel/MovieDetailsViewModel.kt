package com.cheesecake.tickters.presentation.movieDetails.viewModel

import androidx.lifecycle.SavedStateHandle
import com.cheesecake.tickters.navigation.MovieDetailsArgs
import com.cheesecake.tickters.repository.IMoviesRepository
import com.cheesecake.tickters.dataSource.Entity.MovieType
import com.cheesecake.tickters.base.BaseViewModel
import com.cheesecake.tickters.presentation.movieDetails.viewModel.state.MovieDetailsUIState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.update
import javax.inject.Inject

@HiltViewModel
class MovieDetailsViewModel  @Inject constructor(
    repository: IMoviesRepository,
    savedStateHandle: SavedStateHandle,
): BaseViewModel<MovieDetailsUIState>(MovieDetailsUIState()) {

    private val args = MovieDetailsArgs(savedStateHandle)

    private val movie = when(args.type) {
        MovieType.NOW_SHOWING -> {
            repository.getNowShowingMovies()[args.id]
        }
        else -> {
            repository.getComingSoonItems()[args.id]
        }
    }

    init {
        _state.update {
            it.copy(
                itemsCast = movie.cast,
                tags = movie.tags,
                title = movie.title,
                description = "Professor Albus Dumbledore knows the powerful, dark wizard Gellert Grindelwald is moving to seize control of the wizarding world. Unable to stop him from",
                imageUrl = movie.imageUrl,

            )
        }
    }


}
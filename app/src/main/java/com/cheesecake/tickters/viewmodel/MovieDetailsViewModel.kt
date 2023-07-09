package com.cheesecake.tickters.viewmodel

import androidx.lifecycle.SavedStateHandle
import com.cheesecake.tickters.navigation.MovieDetailsArgs
import com.cheesecake.tickters.repository.IMoviesRepository
import com.cheesecake.tickters.repository.MoviesRepositoryImpl
import com.cheesecake.tickters.viewmodel.model.MovieType
import com.cheesecake.tickters.viewmodel.state.MovieDetailsUIState
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
            repository.getNowShowingMovies().getOrNull(args.id)
        }
        else -> {
            repository.getComingSoonItems().getOrNull(args.id)
        }
    }

    init {
        _state.update {
            it.copy(
                itemsCast = listOf(
                    movie?.imageUrl!!,
                    movie.imageUrl,
                    movie.imageUrl,
                    movie.imageUrl,
                    movie.imageUrl,
                    movie.imageUrl,
                    movie.imageUrl,
                    movie.imageUrl,
                    movie.imageUrl,
                ),
                tags = movie.tags,
                title = movie.title,
                description = "Professor Albus Dumbledore knows the powerful, dark wizard Gellert Grindelwald is moving to seize control of the wizarding world. Unable to stop him from",
                imageUrl = movie.imageUrl
            )
        }
    }


}
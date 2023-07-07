package com.cheesecake.tickters.repository

import com.cheesecake.tickters.repository.dataSource.DataSource
import com.cheesecake.tickters.viewmodel.model.Movie
import com.cheesecake.tickters.viewmodel.model.MovieType
import javax.inject.Inject

class MoviesRepositoryImpl @Inject constructor() : IMoviesRepository {

    override fun getNowShowingMovies() = DataSource.nowShowingMovies

    override fun getComingSoonItems() = DataSource.comingSoonMovies
}
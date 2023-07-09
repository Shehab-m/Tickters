package com.cheesecake.tickters.repository

import com.cheesecake.tickters.dataSource.DataSource
import javax.inject.Inject

class MoviesRepositoryImpl @Inject constructor() : IMoviesRepository {

    override fun getNowShowingMovies() = DataSource.nowShowingMovies

    override fun getComingSoonItems() = DataSource.comingSoonMovies
}
package com.cheesecake.tickters.repository

import com.cheesecake.tickters.viewmodel.model.Movie

interface IMoviesRepository {

    fun getNowShowingMovies(): List<Movie>

    fun getComingSoonItems(): List<Movie>
}
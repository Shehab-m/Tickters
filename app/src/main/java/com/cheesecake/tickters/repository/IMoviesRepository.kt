package com.cheesecake.tickters.repository

import com.cheesecake.tickters.repository.Entity.Movie

interface IMoviesRepository {

    fun getNowShowingMovies(): List<Movie>

    fun getComingSoonItems(): List<Movie>
}
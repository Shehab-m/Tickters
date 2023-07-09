package com.cheesecake.tickters.repository

import com.cheesecake.tickters.Entity.Movie

interface IMoviesRepository {

    fun getNowShowingMovies(): List<Movie>

    fun getComingSoonItems(): List<Movie>
}
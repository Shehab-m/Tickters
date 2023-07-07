package com.cheesecake.tickters.di

import com.cheesecake.tickters.repository.IMoviesRepository
import com.cheesecake.tickters.repository.MoviesRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent


@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {
    @Binds
    abstract fun provideRepository(repository: MoviesRepositoryImpl): IMoviesRepository
}

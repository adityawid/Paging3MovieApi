package com.adityawidayanto.paging3movieapi.di.movie

import com.adityawidayanto.paging3movieapi.data.repository.MovieRepositoryImpl
import com.adityawidayanto.paging3movieapi.domain.MovieRepository
import dagger.Binds
import dagger.Module

@Module
interface RepositoryModule {
    @Binds
    fun bindMovieRepository(repository: MovieRepositoryImpl): MovieRepository
}
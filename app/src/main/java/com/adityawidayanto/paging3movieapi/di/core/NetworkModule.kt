package com.adityawidayanto.core.di

import com.adityawidayanto.paging3movieapi.network.NetworkService
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
class NetworkModule {

    @Singleton
    @Provides
    fun provideMovieHostUrl(): String = "https://api.themoviedb.org/3/"

    @Singleton
    @Provides
    fun provideMovieService(): Retrofit = NetworkService().createService(provideMovieHostUrl())

}
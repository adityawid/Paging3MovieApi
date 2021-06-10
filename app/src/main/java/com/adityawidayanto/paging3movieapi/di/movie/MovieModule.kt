package com.adityawidayanto.paging3movieapi.di.movie

import com.adityawidayanto.core.di.CoreScope
import com.adityawidayanto.paging3movieapi.BuildConfig
import com.adityawidayanto.paging3movieapi.data.api.MovieApi
import com.adityawidayanto.paging3movieapi.data.repository.MoviePagingSource
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit

@Module
class MovieModule {

    @Provides
    @CoreScope
    fun provideMovieApi(retrofit: Retrofit): MovieApi = retrofit.create(MovieApi::class.java)

    @Provides
    @CoreScope
    fun provideMoviePagingSource(movieApi: MovieApi) = MoviePagingSource(
        movieApi,
        BuildConfig.API_KEY
    )

}
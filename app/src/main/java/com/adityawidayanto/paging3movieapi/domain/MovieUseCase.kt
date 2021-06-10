package com.adityawidayanto.paging3movieapi.domain

import androidx.lifecycle.LiveData
import androidx.paging.PagingData
import com.adityawidayanto.paging3movieapi.data.bean.Movie
import javax.inject.Inject

class MovieUseCase @Inject constructor(private val repository: MovieRepository) {
    fun getPagingMovieList() : LiveData<PagingData<Movie>> = repository.getPopularMoviePaging()
}
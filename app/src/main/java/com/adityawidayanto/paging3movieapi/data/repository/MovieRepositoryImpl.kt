package com.adityawidayanto.paging3movieapi.data.repository

import androidx.lifecycle.LiveData
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import androidx.paging.liveData
import com.adityawidayanto.paging3movieapi.data.bean.Movie
import com.adityawidayanto.paging3movieapi.domain.MovieRepository
import javax.inject.Inject

class MovieRepositoryImpl @Inject constructor(
    private val moviePagingSource: MoviePagingSource
) : MovieRepository {

    override fun getPopularMoviePaging(): LiveData<PagingData<Movie>> = Pager(
        config = PagingConfig(
            pageSize = 5,
            maxSize = 20,
            enablePlaceholders = false
        ),
        pagingSourceFactory = { moviePagingSource }
    ).liveData
}
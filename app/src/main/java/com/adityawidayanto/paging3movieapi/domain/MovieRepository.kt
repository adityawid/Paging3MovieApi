package com.adityawidayanto.paging3movieapi.domain

import androidx.lifecycle.LiveData
import androidx.paging.PagingData
import com.adityawidayanto.paging3movieapi.data.bean.Movie

interface MovieRepository {
    fun getPopularMoviePaging(): LiveData<PagingData<Movie>>
}
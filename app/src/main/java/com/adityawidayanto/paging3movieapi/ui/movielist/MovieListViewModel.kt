package com.adityawidayanto.paging3movieapi.ui.movielist

import androidx.lifecycle.ViewModel
import com.adityawidayanto.paging3movieapi.domain.MovieUseCase
import javax.inject.Inject

class MovieListViewModel @Inject constructor(private val movieUseCase: MovieUseCase) : ViewModel() {

    val movies = movieUseCase.getPagingMovieList()
}
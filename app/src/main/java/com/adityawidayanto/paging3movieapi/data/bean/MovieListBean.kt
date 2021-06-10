package com.adityawidayanto.paging3movieapi.data.bean

import com.google.gson.annotations.SerializedName

data class MovieListBean(
    @SerializedName("results")
    val movies: List<Movie>
)
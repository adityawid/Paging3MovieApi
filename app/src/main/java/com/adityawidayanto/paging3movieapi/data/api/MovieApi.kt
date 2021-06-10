package com.adityawidayanto.paging3movieapi.data.api

import com.adityawidayanto.paging3movieapi.data.bean.MovieListBean
import retrofit2.http.GET
import retrofit2.http.Query

interface MovieApi {
    @GET("movie/popular")
    suspend fun getPopularMovie(
        @Query("api_key") apiKey: String,
        @Query("page") page: Int
    ): MovieListBean
}
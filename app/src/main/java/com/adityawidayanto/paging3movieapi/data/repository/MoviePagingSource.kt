package com.adityawidayanto.paging3movieapi.data.repository

import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.adityawidayanto.paging3movieapi.data.api.MovieApi
import com.adityawidayanto.paging3movieapi.data.bean.Movie
import retrofit2.HttpException
import java.io.IOException

class MoviePagingSource(private val movieApi: MovieApi, private val apikey: String) :
    PagingSource<Int, Movie>() {

    override fun getRefreshKey(state: PagingState<Int, Movie>): Int? {
        return state.anchorPosition?.let { position ->
            state.closestPageToPosition(position)?.prevKey?.plus(1) ?:
            state.closestPageToPosition(position)?.nextKey?.minus(1)
        }
    }

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, Movie> {
        return try {
            val position = params.key ?: 1
            val response = movieApi.getPopularMovie(apikey, position)
            val movies = response.movies
            LoadResult.Page(
                data = movies,
                prevKey = if (position == 1) null else position - 1,
                nextKey = if (movies.isEmpty()) null else position + 1
            )
        } catch (e: IOException) {
            LoadResult.Error(e)
        } catch (e: HttpException) {
            LoadResult.Error(e)
        }
    }
}
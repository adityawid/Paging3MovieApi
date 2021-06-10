package com.adityawidayanto.paging3movieapi.ui.movielist

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.adityawidayanto.paging3movieapi.R
import com.adityawidayanto.paging3movieapi.data.bean.Movie
import com.adityawidayanto.paging3movieapi.databinding.ItemMovieBinding
import com.bumptech.glide.Glide

class MoviePagingAdapter :
    PagingDataAdapter<Movie, MoviePagingAdapter.ViewHolder>(listItemCallback) {
    class ViewHolder(private val binding: ItemMovieBinding) :
        RecyclerView.ViewHolder(binding.root) {
        init {
            binding.root.setOnClickListener {
            }
        }

        fun bind(movie: Movie) {
            binding.titleTextView.text = movie.title
            binding.descriptionTextView.text = movie.overview
            val posterURL = "https://image.tmdb.org/t/p/w500" + movie.posterPath
            Glide.with(binding.imageView.context)
                .load(posterURL)
                .into(binding.imageView)

        }


    }

    companion object {
        val listItemCallback = object : DiffUtil.ItemCallback<Movie>() {
            override fun areItemsTheSame(oldItem: Movie, newItem: Movie): Boolean {
                return oldItem.id == newItem.id
            }

            override fun areContentsTheSame(oldItem: Movie, newItem: Movie): Boolean {
                return oldItem == newItem
            }

        }
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val data = getItem(position)
        data?.let { holder.bind(it) }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding: ItemMovieBinding = DataBindingUtil.inflate(
            layoutInflater,
            R.layout.item_movie,
            parent,
            false
        )
        return ViewHolder(binding)
    }
}
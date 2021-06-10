package com.adityawidayanto.paging3movieapi.ui.movielist

import androidx.recyclerview.widget.LinearLayoutManager
import com.adityawidayanto.paging3movieapi.R
import com.adityawidayanto.paging3movieapi.base.CoreApp
import com.adityawidayanto.paging3movieapi.databinding.MovieListFragmentBinding
import com.adityawidayanto.paging3movieapi.di.movie.DaggerMovieComponent
import com.adityawidayanto.paging3movieapi.ui.BaseFragment

class MovieListFragment : BaseFragment<MovieListFragmentBinding, MovieListViewModel>() {
    private val adapter: MoviePagingAdapter by lazy {
        MoviePagingAdapter()
    }

    override fun getLayoutResourceId(): Int = R.layout.movie_list_fragment

    override fun initDaggerComponent() {
        DaggerMovieComponent.builder().coreComponent(CoreApp.coreComponent(requireContext()))
            .build()
            .inject(this)
    }

    override fun initObservers() {
        vm.movies.observe(viewLifecycleOwner, {
            adapter.submitData(viewLifecycleOwner.lifecycle, it)
        })
    }

    override fun initView() {
        binding.apply {
            rvMovieList.layoutManager = LinearLayoutManager(context)
            rvMovieList.adapter = adapter
        }
    }

    override fun getViewModelClass(): Class<MovieListViewModel> = MovieListViewModel::class.java


}
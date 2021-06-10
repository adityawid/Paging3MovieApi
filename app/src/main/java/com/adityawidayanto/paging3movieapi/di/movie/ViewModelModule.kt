package com.adityawidayanto.paging3movieapi.di.movie

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.adityawidayanto.core.di.ViewModelFactory
import com.adityawidayanto.core.di.ViewModelKey
import com.adityawidayanto.paging3movieapi.ui.movielist.MovieListViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class ViewModelModule {
    @Binds
    abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory

    @Binds
    @IntoMap
    @ViewModelKey(MovieListViewModel::class)
    abstract fun provideMovieListViewModel(viewModel: MovieListViewModel): ViewModel
}
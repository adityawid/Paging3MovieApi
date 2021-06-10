package com.adityawidayanto.paging3movieapi.di.movie

import com.adityawidayanto.core.di.CoreComponent
import com.adityawidayanto.core.di.CoreScope
import com.adityawidayanto.paging3movieapi.ui.movielist.MovieListFragment
import dagger.Component

@CoreScope
@Component(
    dependencies = [CoreComponent::class],
    modules = [
        MovieModule::class,
        RepositoryModule::class,
        ViewModelModule::class
    ]
)
interface MovieComponent {
    fun inject(movieListFragment: MovieListFragment)
}
package com.adityawidayanto.core.di

import com.adityawidayanto.paging3movieapi.utils.dispatcher.CoroutineDispatcherProvider
import com.adityawidayanto.paging3movieapi.utils.dispatcher.DispatcherProvider
import dagger.Binds
import dagger.Module

@Module
interface CoroutineDispatcherModule {
    @Binds
    fun bindDispatcher(dispatcherProvider: CoroutineDispatcherProvider): DispatcherProvider
}
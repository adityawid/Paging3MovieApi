package com.adityawidayanto.core.di

import android.app.Application
import android.content.Context
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class CoreModule {
    @Singleton
    @Provides
    fun provideContext(app: Application): Context = app
}
package com.adityawidayanto.core.di

import android.app.Application
import android.content.Context
import com.adityawidayanto.paging3movieapi.utils.dispatcher.DispatcherProvider
import dagger.BindsInstance
import dagger.Component
import retrofit2.Retrofit
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        CoreModule::class,
        NetworkModule::class,
        CoroutineDispatcherModule::class
    ]
)
interface CoreComponent {
    fun context(): Context
    fun movieService(): Retrofit
//    fun dispatcher(): DispatcherProvider


    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder

        fun build(): CoreComponent
    }
}
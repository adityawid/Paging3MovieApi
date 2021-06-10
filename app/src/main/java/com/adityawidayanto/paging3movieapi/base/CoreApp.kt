package com.adityawidayanto.paging3movieapi.base

import android.content.Context
import androidx.multidex.MultiDexApplication
import com.adityawidayanto.core.di.CoreComponent
import com.adityawidayanto.core.di.DaggerCoreComponent

class CoreApp : MultiDexApplication() {
    lateinit var coreComponent: CoreComponent

    companion object {
        fun coreComponent(context: Context) =
            (context.applicationContext as? CoreApp)?.coreComponent
    }

    override fun onCreate() {
        super.onCreate()
        initCoreDependencyInjection()
    }

    private fun initCoreDependencyInjection() {
        coreComponent = DaggerCoreComponent
            .builder()
            .application(this)
            .build()
    }
}
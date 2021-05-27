package com.adityawidayanto.paging3movieapi.base

import androidx.multidex.MultiDexApplication
import com.adityawidayanto.core.di.CoreComponent
import com.adityawidayanto.core.di.DaggerCoreComponent

class CoreApp : MultiDexApplication() {
    lateinit var coreComponent: CoreComponent

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
package com.nehasrivastava.mvvm

import android.app.Application
import com.nehasrivastava.mvvm.di.component.ApplicationComponent
import com.nehasrivastava.mvvm.di.component.DaggerApplicationComponent
import com.nehasrivastava.mvvm.di.module.ApplicationModule

class MVVMApplication : Application() {

    lateinit var applicationComponent: ApplicationComponent

    override fun onCreate() {
        super.onCreate()
        injectDependencies()
    }

    private fun injectDependencies() {
        applicationComponent = DaggerApplicationComponent
            .builder()
            .applicationModule(ApplicationModule(this))
            .build()
        applicationComponent.inject(this)
    }
}
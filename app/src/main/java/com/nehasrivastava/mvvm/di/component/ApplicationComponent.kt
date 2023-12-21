package com.nehasrivastava.mvvm.di.component

import android.content.Context
import com.nehasrivastava.mvvm.MVVMApplication
import com.nehasrivastava.mvvm.data.api.NetworkService
import com.nehasrivastava.mvvm.data.repository.TopHeadlineRepository
import com.nehasrivastava.mvvm.di.ApplicationContext
import com.nehasrivastava.mvvm.di.module.ApplicationModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [ApplicationModule::class])
interface ApplicationComponent {

    fun inject(application: MVVMApplication)

    @ApplicationContext
    fun getContext(): Context

    fun getNetworkService(): NetworkService

    fun getTopHeadlineRepository(): TopHeadlineRepository

}
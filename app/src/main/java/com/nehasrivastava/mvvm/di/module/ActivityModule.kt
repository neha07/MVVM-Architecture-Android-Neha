package com.nehasrivastava.mvvm.di.module

import android.content.Context
import androidx.lifecycle.ViewModelProvider
import com.nehasrivastava.mvvm.data.repository.TopHeadlineRepository
import com.nehasrivastava.mvvm.di.ActivityContext
import androidx.appcompat.app.AppCompatActivity
import com.nehasrivastava.mvvm.ui.base.ViewModelProviderFactory
import com.nehasrivastava.mvvm.ui.topheadline.TopHeadlineAdapter
import com.nehasrivastava.mvvm.ui.topheadline.TopHeadlineViewModel
import dagger.Module
import dagger.Provides

@Module
class ActivityModule(private val activity: AppCompatActivity) {

    @ActivityContext
    @Provides
    fun provideContext(): Context {
        return activity
    }

    @Provides
    fun provideTopHeadlineViewModel(topHeadlineRepository: TopHeadlineRepository): TopHeadlineViewModel {
        return ViewModelProvider(activity,
            ViewModelProviderFactory(TopHeadlineViewModel::class) {
                TopHeadlineViewModel(topHeadlineRepository)
            })[TopHeadlineViewModel::class.java]
    }

    @Provides
    fun provideTopHeadlineAdapter() = TopHeadlineAdapter(ArrayList())

}
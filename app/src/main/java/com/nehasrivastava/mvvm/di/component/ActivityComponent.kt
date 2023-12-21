package com.nehasrivastava.mvvm.di.component

import com.nehasrivastava.mvvm.di.ActivityScope
import com.nehasrivastava.mvvm.di.module.ActivityModule
import com.nehasrivastava.mvvm.ui.topheadline.TopHeadlineActivity
import dagger.Component

@ActivityScope
@Component(dependencies = [ApplicationComponent::class], modules = [ActivityModule::class])
interface ActivityComponent {

    fun inject(activity: TopHeadlineActivity)

}
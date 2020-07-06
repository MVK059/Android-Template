package com.mvk.app.di

import androidx.lifecycle.ViewModelProvider
import com.mvk.app.ui.MainViewModel
import com.mvk.base.di.ActivityScope
import com.mvk.base.ui.BaseActivity
import com.mvk.base.utils.ViewModelProviderFactory
import com.mvk.base.utils.network.NetworkHelper
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import dagger.hilt.android.qualifiers.ActivityContext

@Module
@InstallIn(ApplicationComponent::class)
object BaseActivityModule {

    @Provides
    @ActivityScope
    fun provideMainViewModel(
        @ActivityContext activity: BaseActivity,
        networkHelper: NetworkHelper
    ): MainViewModel = ViewModelProvider(
        activity, ViewModelProviderFactory(MainViewModel::class) {
            MainViewModel(networkHelper)
        }).get(MainViewModel::class.java)

}
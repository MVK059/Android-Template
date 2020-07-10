package com.mvk.app.di.module

import androidx.lifecycle.ViewModelProvider
import com.mvk.app.ui.MainViewModel
import com.mvk.base.ui.BaseActivity
import com.mvk.base.utils.ViewModelProviderFactory
import com.mvk.base.utils.network.NetworkHelper
import dagger.Module
import dagger.Provides

@Module
class MainActivityModule(private val activity: BaseActivity<*>) {

    @Provides
    fun provideMainViewModel(
        networkHelper: NetworkHelper
    ): MainViewModel = ViewModelProvider(
        activity, ViewModelProviderFactory(MainViewModel::class) {
            MainViewModel(networkHelper)
        }).get(MainViewModel::class.java)

    @Provides
    fun provideHello() = "Hello World"
}
package com.mvk.base.di.component

import android.app.Application
import android.content.SharedPreferences
import com.mvk.base.di.module.BaseModule
import com.mvk.base.utils.network.NetworkHelper
import com.mvk.database.db.DatabaseService
import com.mvk.network.NetworkService
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [BaseModule::class])
interface BaseComponent {

    fun inject(application: Application)

    fun getNetworkService(): NetworkService

    fun getDatabaseService(): DatabaseService

    fun getSharedPreferences(): SharedPreferences

    fun getNetworkHelper(): NetworkHelper
}
package com.mvk.base.di.module

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import androidx.room.Room
import com.mvk.base.BuildConfig
import com.mvk.base.utils.network.NetworkHelper
import com.mvk.database.db.DatabaseService
import com.mvk.network.Networking
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class BaseModule(private val application: Application) {

    @Provides
    @Singleton
    fun provideDatabaseService() =
        Room.databaseBuilder(
        application, DatabaseService::class.java,
        "project-db"
    ).build()

    @Provides
    @Singleton
    fun provideNetworkService() =
        Networking.create(
            BuildConfig.API_KEY,
            BuildConfig.BASE_URL,
            application.cacheDir,
            10 * 1024 * 1024 // 10MB
        )

    @Singleton
    @Provides
    fun provideNetworkHelper(): NetworkHelper = NetworkHelper(application)

    @Provides
    @Singleton
    fun provideSharedPreferences(): SharedPreferences =
        application.getSharedPreferences("project-prefs", Context.MODE_PRIVATE)
}
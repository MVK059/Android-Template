package com.mvk.base.di

import android.content.Context
import android.content.SharedPreferences
import androidx.room.Room
import com.mvk.base.BuildConfig
import com.mvk.base.utils.network.NetworkHelper
import com.mvk.database.db.DatabaseService
import com.mvk.network.NetworkService
import com.mvk.network.Networking
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
object BaseApplicationModule {

    @Provides
    @Singleton
    fun provideNetworkService(@ApplicationContext context: Context): NetworkService =
        Networking.create(
            BuildConfig.API_KEY,
            BuildConfig.BASE_URL,
            context.cacheDir,
            10 * 1024 * 1024 // 10MB
        )

    @Singleton
    @Provides
    fun provideNetworkHelper(@ApplicationContext context: Context): NetworkHelper =
        NetworkHelper(context)

    @Provides
    @Singleton
    fun provideDatabaseService(@ApplicationContext context: Context): DatabaseService =
        Room.databaseBuilder(
            context, DatabaseService::class.java,
            "base-db"
        ).build()

    @Provides
    @Singleton
    fun provideSharedPreferences(@ApplicationContext context: Context): SharedPreferences =
        context.getSharedPreferences("base-prefs", Context.MODE_PRIVATE)


}
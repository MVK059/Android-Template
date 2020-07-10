package com.mvk.app

import android.app.Application
import com.mvk.base.di.BaseComponentProvider
import com.mvk.base.di.component.BaseComponent
import com.mvk.base.di.component.DaggerBaseComponent
import com.mvk.base.di.module.BaseModule

class App : Application(), BaseComponentProvider {

    lateinit var baseComponent: BaseComponent

    override fun onCreate() {
        super.onCreate()

        baseComponent = DaggerBaseComponent
            .builder()
            .baseModule(BaseModule(this))
            .build()
        baseComponent.inject(this)
    }

    override fun provideBaseComponent(): BaseComponent {
        return baseComponent
    }

}
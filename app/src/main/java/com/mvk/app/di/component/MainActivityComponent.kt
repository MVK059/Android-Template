package com.mvk.app.di.component

import com.mvk.app.di.module.MainActivityModule
import com.mvk.app.ui.MainActivity
import com.mvk.base.di.ActivityScope
import com.mvk.base.di.component.BaseComponent
import dagger.Component

@ActivityScope
@Component(
    dependencies = [BaseComponent::class],
    modules = [MainActivityModule::class]
)
interface MainActivityComponent {

    fun inject(activity: MainActivity)

}
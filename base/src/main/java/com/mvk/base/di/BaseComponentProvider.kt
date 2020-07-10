package com.mvk.base.di

import com.mvk.base.di.component.BaseComponent

interface BaseComponentProvider {

    fun provideBaseComponent(): BaseComponent

}
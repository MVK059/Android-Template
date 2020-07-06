package com.mvk.app.ui

import android.os.Bundle
import com.mvk.app.BR
import com.mvk.app.R
import com.mvk.base.di.ActivityScope
import com.mvk.base.ui.BaseActivity
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject


@AndroidEntryPoint
class MainActivity : BaseActivity() {

    @Inject
    @ActivityScope
    lateinit var viewModelNew: MainViewModel

    override fun provideDataBindingVariable(): Int = BR.mainVM

    override fun provideLayoutId(): Int = R.layout.activity_main

    override fun setupView(savedInstanceState: Bundle?) {}

    override fun provideViewModel() = viewModelNew

}

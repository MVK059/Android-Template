package com.mvk.app.ui

import android.os.Bundle
import android.widget.Toast
import com.mvk.app.BR
import com.mvk.app.R
import com.mvk.app.databinding.ActivityMainBinding
import com.mvk.app.di.component.DaggerMainActivityComponent
import com.mvk.base.di.InjectUtils
import com.mvk.base.ui.BaseActivity
import javax.inject.Inject

class MainActivity : BaseActivity<ActivityMainBinding>() {

    @Inject
    lateinit var mainViewModel: MainViewModel

    @Inject
    lateinit var hello: String

    override fun provideDataBindingVariable(): Int = BR.mainVM

    override fun provideLayoutId(): Int = R.layout.activity_main

    override fun setupView(savedInstanceState: Bundle?) {
        DaggerMainActivityComponent
            .builder()
            .baseComponent(InjectUtils.provideBaseComponent(applicationContext))
            .build()
            .inject(this)

        Toast.makeText(this, hello, Toast.LENGTH_LONG).show()
    }

    override fun provideViewModel() = mainViewModel
}

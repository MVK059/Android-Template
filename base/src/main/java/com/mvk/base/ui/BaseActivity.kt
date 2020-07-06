package com.mvk.base.ui

import android.os.Bundle
import androidx.annotation.LayoutRes
import androidx.annotation.StringRes
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.Observer
import com.mvk.base.utils.display.Toaster
import dagger.hilt.android.AndroidEntryPoint

/**
 * Reference for generics: https://kotlinlang.org/docs/reference/generics.html
 * Basically BaseActivity will take any class that extends BaseViewModel
 */
@AndroidEntryPoint
abstract class BaseActivity() : AppCompatActivity() {

//    @ActivityScope
//    @Inject
    lateinit var viewModel: BaseViewModel

    lateinit var dataBinding: ViewDataBinding

    override fun onCreate(savedInstanceState: Bundle?) {
//        injectDependencies(buildActivityComponent())
        super.onCreate(savedInstanceState)
        viewModel = provideViewModel()
//        provideViewModel().onCreate()
        viewModel.onCreate()
        setupDataBinding()
//        setContentView(provideLayoutId())
        setupObservers()
        setupView(savedInstanceState)
    }

//    fun getViewDataBinding(): T = dataBinding

    /*private fun buildActivityComponent() =
        DaggerActivityComponent
            .builder()
            .applicationComponent((application as InstagramApplication).applicationComponent)
            .activityModule(ActivityModule(this))
            .build()*/

    protected open fun setupObservers() {
        viewModel.messageString.observe(this, Observer {
            it.data?.run { showMessage(this) }
        })

        viewModel.messageStringId.observe(this, Observer {
            it.data?.run { showMessage(this) }
        })
    }

    private fun setupDataBinding() {
        dataBinding = DataBindingUtil.setContentView(this, provideLayoutId())
        dataBinding.setVariable(provideDataBindingVariable(), viewModel)
        dataBinding.executePendingBindings()
    }

    fun showMessage(message: String) = Toaster.show(applicationContext, message)

    fun showMessage(@StringRes resId: Int) = showMessage(getString(resId))

    open fun goBack() = onBackPressed()

    override fun onBackPressed() {
        if (supportFragmentManager.backStackEntryCount > 0)
            supportFragmentManager.popBackStackImmediate()
        else super.onBackPressed()
    }

    /**
     * Override for set binding variable
     *
     * @return variable id
     */
    protected abstract fun provideDataBindingVariable(): Int

    @LayoutRes
    protected abstract fun provideLayoutId(): Int

//    protected abstract fun injectDependencies(activityComponent: ActivityComponent)

    protected abstract fun setupView(savedInstanceState: Bundle?)

    protected abstract fun provideViewModel(): BaseViewModel
}
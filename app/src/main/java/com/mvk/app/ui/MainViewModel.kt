package com.mvk.app.ui

import androidx.hilt.lifecycle.ViewModelInject
import com.mvk.base.ui.BaseViewModel
import com.mvk.base.utils.network.NetworkHelper

class MainViewModel @ViewModelInject constructor(
    networkHelper: NetworkHelper
) : BaseViewModel(networkHelper) {


    override fun onCreate() {
    }
}
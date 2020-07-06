package com.mvk.base.ui

import androidx.lifecycle.MutableLiveData
import com.mvk.base.utils.network.NetworkHelper


abstract class BaseItemViewModel<T : Any>(
    networkHelper: NetworkHelper
) : BaseViewModel(networkHelper) {

    val data: MutableLiveData<T> = MutableLiveData()

    fun onManualCleared() = onCleared()

    fun updateData(data: T) {
        this.data.postValue(data)
    }
}
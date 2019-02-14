package com.iroyoraso.comicville.ui.commons

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProviders

/**
 * Created by iroyo on 13/02/2019. iroyoraso@gmail.com
 */


inline fun <reified T : ViewModel> FragmentActivity.getViewModel(noinline creator: (() -> T)): Lazy<T> {
    return lazy { ViewModelProviders.of(this, ViewModelFactory(creator)).get(T::class.java) }
}


inline fun <reified T : ViewModel> Fragment.getViewModel(noinline creator: (() -> T)): Lazy<T> {
    return lazy { ViewModelProviders.of(this, ViewModelFactory(creator)).get(T::class.java) }
}

package com.iroyoraso.comicville.ui.screens.list

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.iroyoraso.comicville.core.LoadCharacters

/**
 * Created by iroyo on 13/02/2019. iroyoraso@gmail.com
 */
class CharactersViewModel(private val name: String) : ViewModel() {

    private val state = MutableLiveData<String>()

    init {
        state.value = name
    }

    fun getState() : LiveData<String> = state

}
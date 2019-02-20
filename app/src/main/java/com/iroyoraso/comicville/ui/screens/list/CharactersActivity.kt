package com.iroyoraso.comicville.ui.screens.list

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.iroyoraso.comicville.R
import com.iroyoraso.comicville.ui.commons.injectFrom

class CharactersActivity : AppCompatActivity() {

    private val viewModel by injectFrom { CharactersModule().viewModel }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_characters)

        viewModel.getState().observe(this, Observer {
            Log.d("DOONAMIS", it)
        })

    }
}

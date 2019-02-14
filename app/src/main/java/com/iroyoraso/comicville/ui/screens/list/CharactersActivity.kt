package com.iroyoraso.comicville.ui.screens.list

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.iroyoraso.comicville.R
import com.iroyoraso.comicville.ui.commons.getViewModel

class CharactersActivity : AppCompatActivity() {

    private val viewModel by getViewModel { CharactersViewModel() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_characters)

    }
}

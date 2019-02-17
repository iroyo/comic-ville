package com.iroyoraso.comicville.ui.screens.list

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.iroyoraso.comicville.R
import com.iroyoraso.comicville.graph.apiCharacters
import com.iroyoraso.comicville.graph.apiPublishers
import com.iroyoraso.comicville.ui.commons.getViewModel

class CharactersActivity : AppCompatActivity() {

    private val viewModel by getViewModel { CharactersViewModel() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_characters)

        val api1 = apiCharacters()
        val api2 = apiPublishers()

        Log.d("ISAAC", api1.networkComponent.okHttpClient.toString() + " ----" + api2.networkComponent.okHttpClient.toString())

    }
}

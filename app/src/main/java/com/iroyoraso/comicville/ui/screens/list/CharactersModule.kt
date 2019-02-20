package com.iroyoraso.comicville.ui.screens.list

/**
 * Created by iroyo on 20/2/19.
 * Mail: iroyoraso@gmail.com
 */
class CharactersModule : CharactersComponent {

    override val viewModel: CharactersViewModel get() = CharactersViewModel(
        "test"
    )

}
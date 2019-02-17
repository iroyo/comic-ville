package com.iroyoraso.comicville.graph

import com.iroyoraso.comicville.data.CharactersApi

/**
 * Created by iroyo on 16/2/19.
 * Mail: iroyoraso@gmail.com
 */
object ModuleCharacters : ApiComponent<CharactersApi> {

    override val networkComponent = NetworkModule

    override val apiService: CharactersApi = networkComponent.retrofit.create(CharactersApi::class.java)

}
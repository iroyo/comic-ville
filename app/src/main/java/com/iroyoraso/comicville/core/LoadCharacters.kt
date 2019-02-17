package com.iroyoraso.comicville.core

import com.iroyoraso.comicville.core.model.CharacterEntity
import com.iroyoraso.comicville.data.CharactersApi

/**
 * DOONAMIS
 * Created by iroyo on 14/02/2019.
 */
class LoadCharacters(private val api: CharactersApi) : Action<Int, List<CharacterEntity>> {

    override suspend fun perform(input: Int): List<CharacterEntity> {
        val response = api.characters(input).await()
        return response.results.map {
            CharacterEntity(
                it.heroName
            )
        }
    }

}
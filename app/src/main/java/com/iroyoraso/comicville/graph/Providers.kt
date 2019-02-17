package com.iroyoraso.comicville.graph

import com.iroyoraso.comicville.data.CharactersApi
import com.iroyoraso.comicville.data.PublishersApi

/**
 * Created by iroyo on 15/2/19.
 * Mail: iroyoraso@gmail.com
 */

fun apiCharacters() : ApiComponent<CharactersApi> = ModuleCharacters
fun apiPublishers() : ApiComponent<PublishersApi> = ModulePublishers

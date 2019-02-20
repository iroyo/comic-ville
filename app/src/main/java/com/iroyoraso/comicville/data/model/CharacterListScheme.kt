package com.iroyoraso.comicville.data.model

import com.squareup.moshi.Json

/**
 * DOONAMIS
 * Created by iroyo on 14/02/2019.
 */
data class CharacterListScheme(
    @Json(name = "error") val error: String,
    @Json(name = "status_code") val code: Int,
    @Json(name = "limit") val limit: Int,
    @Json(name = "offset") val offset: Int,
    @Json(name = "results") val results: List<CharacterScheme>
)
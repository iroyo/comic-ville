package com.iroyoraso.comicville.data.model

import com.squareup.moshi.Json

/**
 * DOONAMIS
 * Created by iroyo on 14/02/2019.
 */
data class Character(
    @Json(name = "id") val id: Int,
    @Json(name = "name") val heroName: String?,
    @Json(name = "real_name") val realName: String?,
    @Json(name = "aliases") val aliases: String?,
    @Json(name = "birth") val birth: String?,
    @Json(name = "deck") val summary: String?,
    @Json(name = "count_of_issue_appearances") val appearances: Int
)
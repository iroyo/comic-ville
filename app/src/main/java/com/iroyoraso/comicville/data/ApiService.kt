package com.iroyoraso.comicville.data

import com.iroyoraso.comicville.data.model.CharactersResponse
import kotlinx.coroutines.Deferred
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * DOONAMIS
 * Created by iroyo on 14/02/2019.
 */
interface ApiService {

    @GET("characters")
    fun characters(@Query("offset") offset: Int, @Query("limit") limit: Int) : Deferred<CharactersResponse>

}
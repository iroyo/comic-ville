package com.iroyoraso.comicville.core

/**
 * DOONAMIS
 * Created by iroyo on 14/02/2019.
 */
interface Action<in I, out O> {

    suspend fun perform(input: I): O

}
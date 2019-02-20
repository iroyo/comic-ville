package com.iroyoraso.comicville.base

/**
 * Created by iroyo on 16/2/19.
 * Mail: iroyoraso@gmail.com
 */
interface ApiComponent<T> {

    val networkComponent: NetworkComponent
    val apiService: T

}
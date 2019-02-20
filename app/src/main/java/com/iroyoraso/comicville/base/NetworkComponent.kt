package com.iroyoraso.comicville.base

import okhttp3.OkHttpClient
import retrofit2.Retrofit

/**
 * Created by iroyo on 15/2/19.
 * Mail: iroyoraso@gmail.com
 */
interface NetworkComponent {

    val okHttpClient: OkHttpClient
    val retrofit: Retrofit

}
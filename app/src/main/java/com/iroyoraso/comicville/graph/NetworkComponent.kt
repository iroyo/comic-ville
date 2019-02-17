package com.iroyoraso.comicville.graph

import com.iroyoraso.comicville.data.network.QueryInterceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.CallAdapter
import retrofit2.Converter
import retrofit2.Retrofit

/**
 * Created by iroyo on 15/2/19.
 * Mail: iroyoraso@gmail.com
 */
interface NetworkComponent {

    val okHttpClient: OkHttpClient
    val retrofit: Retrofit

}
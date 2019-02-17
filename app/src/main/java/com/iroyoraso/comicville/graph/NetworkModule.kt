package com.iroyoraso.comicville.graph

import com.iroyoraso.comicville.BuildConfig
import com.iroyoraso.comicville.data.network.QueryInterceptor
import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import okhttp3.logging.HttpLoggingInterceptor.Level.*
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

/**
 * Created by iroyo on 15/2/19.
 * Mail: iroyoraso@gmail.com
 */

object NetworkModule : NetworkComponent{

    private val level = if (BuildConfig.DEBUG) BODY else NONE

    override val okHttpClient: OkHttpClient = OkHttpClient.Builder()
        .addInterceptor(HttpLoggingInterceptor().setLevel(level))
        .addInterceptor(QueryInterceptor())
        .build()

    override val retrofit: Retrofit = Retrofit.Builder()
        .addCallAdapterFactory(CoroutineCallAdapterFactory())
        .addConverterFactory(MoshiConverterFactory.create())
        .baseUrl(BuildConfig.API_URL)
        .client(okHttpClient)
        .build()


}
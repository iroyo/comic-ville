package com.iroyoraso.comicville.data

import com.iroyoraso.comicville.BuildConfig
import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.Response
import okhttp3.logging.HttpLoggingInterceptor
import okhttp3.logging.HttpLoggingInterceptor.Level.*
import retrofit2.CallAdapter
import retrofit2.Converter
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

/**
 * DOONAMIS
 * Created by iroyo on 14/02/2019.
 */


class ApiInterceptor : Interceptor {

    override fun intercept(chain: Interceptor.Chain): Response {
        val request = chain.request()
        val httpUrl = request.url()

        val url = httpUrl.newBuilder()
            .addQueryParameter("api_key", BuildConfig.COMIC_VINE_KEY)
            .addQueryParameter("format", "json")
            .build()

        val builder = request.newBuilder().url(url)
        return chain.proceed(builder.build())
    }

}

fun createClient(): OkHttpClient {
    val builder = OkHttpClient.Builder()
    val level = if (BuildConfig.DEBUG) BODY else NONE
    builder.addInterceptor(HttpLoggingInterceptor().setLevel(level))
    builder.addInterceptor(ApiInterceptor())
    return builder.build()
}

fun createRetrofit(
    okHttpClient: OkHttpClient,
    callAdapterFactory: CallAdapter.Factory,
    converterFactory: Converter.Factory
) = Retrofit.Builder()
    .baseUrl(BuildConfig.API_URL)
    .addCallAdapterFactory(callAdapterFactory)
    .addConverterFactory(converterFactory)
    .client(okHttpClient)
    .build()



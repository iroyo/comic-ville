package com.iroyoraso.comicville.data.network

import com.iroyoraso.comicville.BuildConfig
import okhttp3.Interceptor
import okhttp3.Response

/**
 * Created by iroyo on 15/2/19.
 * Mail: iroyoraso@gmail.com
 */
class QueryParamsInterceptor : Interceptor {

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
package com.iroyoraso.comicville.base

import com.iroyoraso.comicville.data.PublishersApi

/**
 * Created by iroyo on 16/2/19.
 * Mail: iroyoraso@gmail.com
 */
object ModulePublishers : ApiComponent<PublishersApi> {


    override val networkComponent = NetworkModule

    override val apiService: PublishersApi = networkComponent.retrofit.create(PublishersApi::class.java)

}
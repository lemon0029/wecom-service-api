package com.xsyx.pagoda.wecom.service.api.network.base

import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import retrofit2.Retrofit
import retrofit2.converter.jackson.JacksonConverterFactory

object HttpClientBuilder {

    inline fun <reified T> build(baseUrl: String): T {
        val retrofit: Retrofit = Retrofit.Builder()
            .addConverterFactory(JacksonConverterFactory.create(jacksonObjectMapper()))
            .baseUrl(baseUrl)
            .build()

        return retrofit.create(T::class.java)
    }
}
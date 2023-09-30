package com.xsyx.pagoda.wecom.service.api.network

import com.xsyx.pagoda.wecom.service.api.network.base.HttpClientBuilder
import com.xsyx.pagoda.wecom.service.api.network.base.WeComApiConstants
import com.xsyx.pagoda.wecom.service.api.network.dto.request.WeComAppMessageRecallRequest
import com.xsyx.pagoda.wecom.service.api.network.dto.request.WeComAppMessageSendRequest
import com.xsyx.pagoda.wecom.service.api.network.dto.request.WeComGroupBotMessageSendRequest
import com.xsyx.pagoda.wecom.service.api.network.dto.response.WeComAppAuthenticationResponse
import com.xsyx.pagoda.wecom.service.api.network.dto.response.WeComAppMessageRecallResponse
import com.xsyx.pagoda.wecom.service.api.network.dto.response.WeComAppMessageSendResponse
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query

object WeComAppService {

    private val api = HttpClientBuilder.build<WeComServiceApi>(WeComApiConstants.WECOM_APP_SERVICE_BASE_URL)

    fun authentication(companyId: String, appSecretKey: String): WeComAppAuthenticationResponse {
        val response = api.authentication(companyId, appSecretKey).execute()
        throwCallExceptionIfNecessary(response)
        return response.body()!!
    }

    fun sendAppMessage(accessToken: String, request: WeComAppMessageSendRequest): WeComAppMessageSendResponse {
        val response = api.sendAppMessage(accessToken, request).execute()
        throwCallExceptionIfNecessary(response)
        return response.body()!!
    }

    fun sendGroupBotMessage(key: String, request: WeComGroupBotMessageSendRequest): WeComAppMessageSendResponse {
        val response = api.sendGroupBotMessage(key, request).execute()
        throwCallExceptionIfNecessary(response)
        return response.body()!!
    }

    fun recallAppMessage(accessToken: String, messageId: String): WeComAppMessageRecallResponse {
        val request = WeComAppMessageRecallRequest(messageId)
        val response = api.recallAppMessage(accessToken, request).execute()
        throwCallExceptionIfNecessary(response)
        return response.body()!!
    }

    private fun throwCallExceptionIfNecessary(response: Response<*>) {
        if (response.code() != 200 || response.body() == null) {
            throw CallWeComApiException("invalid response, code = ${response.code()}, error body = ${response.errorBody()}")
        }
    }

    interface WeComServiceApi {
        /**
         * 获取应用访问令牌
         *
         * @param companyId 企业标识
         * @param appSecretKey 企业应用密钥
         */
        @GET("/cgi-bin/gettoken")
        fun authentication(
            @Query("corpid") companyId: String,
            @Query("corpsecret") appSecretKey: String
        ): Call<WeComAppAuthenticationResponse>

        /**
         * 发送应用消息
         */
        @POST("/cgi-bin/message/send")
        fun sendAppMessage(
            @Query("access_token") accessToken: String,
            @Body request: WeComAppMessageSendRequest
        ): Call<WeComAppMessageSendResponse>

        /**
         * 发送群机器人消息
         */
        @POST("/cgi-bin/webhook/send")
        fun sendGroupBotMessage(
            @Query("key") botKey: String,
            @Body request: WeComGroupBotMessageSendRequest
        ): Call<WeComAppMessageSendResponse>

        /**
         * 撤回已发送的应用消息
         */
        @POST("/cgi-bin/message/recall")
        fun recallAppMessage(
            @Query("access_token") accessToken: String,
            @Body request: WeComAppMessageRecallRequest
        ): Call<WeComAppMessageRecallResponse>
    }
}

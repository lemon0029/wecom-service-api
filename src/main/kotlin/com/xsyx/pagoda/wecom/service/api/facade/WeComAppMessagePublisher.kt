package com.xsyx.pagoda.wecom.service.api.facade

import com.xsyx.pagoda.wecom.service.api.message.WeComAppMessage
import com.xsyx.pagoda.wecom.service.api.network.WeComAppService
import com.xsyx.pagoda.wecom.service.api.network.dto.request.WeComAppMessageSendRequestBuilder
import com.xsyx.pagoda.wecom.service.api.network.dto.response.WeComAppMessageSendResponse
import java.time.LocalDateTime
import java.time.ZoneId
import java.util.*

class WeComAppMessagePublisher(
    private val companyId: String,
    private val appAgentId: Int,
    private val appSecretKey: String
) {
    private lateinit var accessToken: String
    private lateinit var accessTokenExpiredAt: LocalDateTime

    private fun publish(vararg toUser: String, message: WeComAppMessage): WeComAppMessageSendResponse {
        refreshIfNecessary()

        val request = WeComAppMessageSendRequestBuilder()
            .withToUsers(*toUser)
            .withMessage(message)
            .withAppAgentId(appAgentId)
            .build()

        return WeComAppService.sendAppMessage(accessToken, request)
    }

    private fun refreshIfNecessary() {
        val tokenHasInitialized = ::accessToken.isInitialized && ::accessTokenExpiredAt.isInitialized
        val tokenHasNotExpired = accessTokenExpiredAt.isBefore(LocalDateTime.now())
        if (tokenHasInitialized && tokenHasNotExpired) return

        val response = WeComAppService.authentication(companyId, appSecretKey)
        accessToken = response.accessToken!!

        val tmp = System.currentTimeMillis() + (response.expiresIn - 180)
        accessTokenExpiredAt = LocalDateTime.ofInstant(Date(tmp).toInstant(), ZoneId.systemDefault())
    }
}
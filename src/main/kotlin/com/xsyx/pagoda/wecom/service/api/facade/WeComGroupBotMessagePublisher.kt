package com.xsyx.pagoda.wecom.service.api.facade

import com.xsyx.pagoda.wecom.service.api.message.WeComAppMessage
import com.xsyx.pagoda.wecom.service.api.network.WeComAppService
import com.xsyx.pagoda.wecom.service.api.network.dto.request.WeComGroupBotMessageSendRequest
import com.xsyx.pagoda.wecom.service.api.network.dto.response.WeComAppMessageSendResponse

class WeComGroupBotMessagePublisher(private val groupBotKey: String) {

    private fun publish(message: WeComAppMessage): WeComAppMessageSendResponse {
        val request = WeComGroupBotMessageSendRequest(message)
        return WeComAppService.sendGroupBotMessage(groupBotKey, request)
    }
}
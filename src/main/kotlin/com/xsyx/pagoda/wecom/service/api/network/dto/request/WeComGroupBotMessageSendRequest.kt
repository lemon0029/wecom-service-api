package com.xsyx.pagoda.wecom.service.api.network.dto.request

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.xsyx.pagoda.wecom.service.api.message.WeComAppMessage
import com.xsyx.pagoda.wecom.service.api.message.WeComAppMessageType
import com.xsyx.pagoda.wecom.service.api.network.base.WeComGroupBotMessageSendRequestSerializer


@JsonSerialize(using = WeComGroupBotMessageSendRequestSerializer::class)
data class WeComGroupBotMessageSendRequest(
    val content: WeComAppMessage,

    @JsonProperty("msgtype")
    val messageType: WeComAppMessageType = content.messageType
)

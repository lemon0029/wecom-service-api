package com.xsyx.pagoda.wecom.service.api.message.bot

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonProperty
import com.xsyx.pagoda.wecom.service.api.message.WeComAppMessage
import com.xsyx.pagoda.wecom.service.api.message.WeComAppMessageType

data class WeComGroupBotImageMessage(
    @JsonProperty("base64")
    val base64: String,

    @JsonProperty("md5")
    val md5: String,

    @JsonIgnore
    override val messageType: WeComAppMessageType = WeComAppMessageType.IMAGE
) : WeComAppMessage
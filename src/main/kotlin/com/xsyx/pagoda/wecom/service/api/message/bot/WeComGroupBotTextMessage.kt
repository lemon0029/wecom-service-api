package com.xsyx.pagoda.wecom.service.api.message.bot

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.xsyx.pagoda.wecom.service.api.message.WeComAppMessage
import com.xsyx.pagoda.wecom.service.api.message.WeComAppMessageType

data class WeComGroupBotTextMessage(
    @JsonProperty("content")
    val content: String,

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("mentioned_list")
    val mentionedList: List<String>? = null,

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("mentioned_mobile_list")
    val mentionedMobileList: List<String>? = null,

    @JsonIgnore
    override val messageType: WeComAppMessageType = WeComAppMessageType.TEXT
) : WeComAppMessage
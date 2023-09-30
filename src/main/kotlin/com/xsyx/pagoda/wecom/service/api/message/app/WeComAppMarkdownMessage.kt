package com.xsyx.pagoda.wecom.service.api.message.app

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonProperty
import com.xsyx.pagoda.wecom.service.api.message.WeComAppMessage
import com.xsyx.pagoda.wecom.service.api.message.WeComAppMessageType

data class WeComAppMarkdownMessage(
    @JsonProperty("content")
    val content: String,

    @JsonIgnore
    override val messageType: WeComAppMessageType = WeComAppMessageType.MARKDOWN
) : WeComAppMessage
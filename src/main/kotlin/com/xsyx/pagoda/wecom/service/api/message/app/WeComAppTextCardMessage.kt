package com.xsyx.pagoda.wecom.service.api.message.app

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonProperty
import com.xsyx.pagoda.wecom.service.api.message.WeComAppMessage
import com.xsyx.pagoda.wecom.service.api.message.WeComAppMessageType

data class WeComAppTextCardMessage(
    @JsonProperty("title")
    val title: String,

    @JsonProperty("description")
    val description: String,

    @JsonProperty("url")
    val url: String,

    @JsonProperty("btntext")
    val buttonText: String,

    @JsonIgnore
    override val messageType: WeComAppMessageType = WeComAppMessageType.TEXT_CARD
) : WeComAppMessage
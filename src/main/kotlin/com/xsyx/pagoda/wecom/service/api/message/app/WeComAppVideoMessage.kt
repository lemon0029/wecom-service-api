package com.xsyx.pagoda.wecom.service.api.message.app

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonProperty
import com.xsyx.pagoda.wecom.service.api.message.WeComAppMessage
import com.xsyx.pagoda.wecom.service.api.message.WeComAppMessageType

data class WeComAppVideoMessage(
    @JsonProperty("media_id")
    val mediaId: String,

    @JsonProperty("title")
    val title: String,

    @JsonProperty("description")
    val description: String,

    @JsonIgnore
    override val messageType: WeComAppMessageType = WeComAppMessageType.VIDEO
) : WeComAppMessage
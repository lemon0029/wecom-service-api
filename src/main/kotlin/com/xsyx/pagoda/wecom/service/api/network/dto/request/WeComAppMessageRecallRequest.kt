package com.xsyx.pagoda.wecom.service.api.network.dto.request

import com.fasterxml.jackson.annotation.JsonProperty

data class WeComAppMessageRecallRequest(
    @JsonProperty("msgid")
    val messageId: String
)

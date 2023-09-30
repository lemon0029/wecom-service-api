package com.xsyx.pagoda.wecom.service.api.network.dto.request

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.xsyx.pagoda.wecom.service.api.network.base.WeComAppMessageSendRequestSerializer
import com.xsyx.pagoda.wecom.service.api.message.WeComAppMessage
import com.xsyx.pagoda.wecom.service.api.message.WeComAppMessageType

@JsonSerialize(using = WeComAppMessageSendRequestSerializer::class)
data class WeComAppMessageSendRequest(
    @JsonProperty("touser")
    val toUsers: List<String>,

    @JsonProperty("toparty")
    val toParties: List<String>?,

    @JsonProperty("totag")
    val toTags: List<String>?,

    @JsonProperty("agentid")
    val agentId: Int,

    val content: WeComAppMessage,

    @JsonProperty("msgtype")
    val messageType: WeComAppMessageType = content.messageType,

    @JsonProperty("safe")
    val safe: Int = 0,

    @JsonProperty("enable_id_trans")
    val enableIdTrans: Int = 0,

    @JsonProperty("enable_duplicate_check")
    val enableDuplicateCheck: Int = 0,

    @JsonProperty("duplicate_check_interval")
    val duplicateCheckInterval: Int = 1800,
)

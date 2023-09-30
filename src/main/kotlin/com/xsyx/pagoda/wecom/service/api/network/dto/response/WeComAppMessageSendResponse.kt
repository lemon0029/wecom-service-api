package com.xsyx.pagoda.wecom.service.api.network.dto.response

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty


@JsonIgnoreProperties(ignoreUnknown = true)
data class WeComAppMessageSendResponse(
    @JsonProperty("errcode")
    val errorCode: Int,

    @JsonProperty("errmsg")
    val errorMessage: String,

    @JsonProperty("invaliduser")
    val invalidUser: String?,

    @JsonProperty("invalidparty")
    val invalidParty: String?,

    @JsonProperty("invalidtag")
    val invalidTag: String?,

    @JsonProperty("unlicenseduser")
    val unlicensedUser: String?,

    @JsonProperty("msgid")
    val messageId: String?,

    @JsonProperty("response_code")
    val responseCode: String?,
)

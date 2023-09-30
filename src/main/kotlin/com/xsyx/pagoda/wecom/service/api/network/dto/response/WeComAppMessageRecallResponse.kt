package com.xsyx.pagoda.wecom.service.api.network.dto.response

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
data class WeComAppMessageRecallResponse(
    @JsonProperty("errcode")
    val errorCode: Int,

    @JsonProperty("errmsg")
    val errorMessage: String
)

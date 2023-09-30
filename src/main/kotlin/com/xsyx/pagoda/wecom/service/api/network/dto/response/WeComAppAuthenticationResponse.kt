package com.xsyx.pagoda.wecom.service.api.network.dto.response

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
data class WeComAppAuthenticationResponse(
    @JsonProperty("errcode")
    val errorCode: Int,

    @JsonProperty("errmsg")
    val errorMessage: String,

    @JsonProperty("access_token")
    val accessToken: String?,

    @JsonProperty("expires_in")
    val expiresIn: Int
)

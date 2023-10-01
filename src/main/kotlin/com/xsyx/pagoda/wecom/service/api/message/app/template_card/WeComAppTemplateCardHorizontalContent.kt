package com.xsyx.pagoda.wecom.service.api.message.app.template_card

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty

data class WeComAppTemplateCardHorizontalContent(
    @JsonProperty("type")
    val type: Int,

    @JsonProperty("keyname")
    val keyName: String,

    @JsonProperty("value")
    val value: String,

    @JsonProperty("url")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    val url: String?,

    @JsonProperty("media_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    val mediaId: String?,

    @JsonProperty("userid")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    val userId: String?,
)
package com.xsyx.pagoda.wecom.service.api.message.app.template_card

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty


data class WeComAppTemplateCardCardAction(
    @JsonProperty("type")
    val type: Int,

    @JsonProperty("url")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    val url: String? = null,

    @JsonProperty("appid")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    val appId: String? = null,

    @JsonProperty("pagepath")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    val pagePath: String? = null,
)
package com.xsyx.pagoda.wecom.service.api.message.app.template_card

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty

data class WeComAppTemplateCardButton(
    @JsonProperty("type")
    val type: Int,

    @JsonProperty("text")
    val text: String,

    @JsonProperty("key")
    val key: String,

    @JsonProperty("style")
    val style: Int = 1,

    @JsonProperty("url")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    val url: String? = null,
)
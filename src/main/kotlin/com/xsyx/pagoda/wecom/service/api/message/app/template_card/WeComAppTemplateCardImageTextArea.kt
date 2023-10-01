package com.xsyx.pagoda.wecom.service.api.message.app.template_card

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty

data class WeComAppTemplateCardImageTextArea(
    @JsonProperty("type")
    val type: Int,

    @JsonProperty("title")
    val title: String,

    @JsonProperty("desc")
    val description: String,

    @JsonProperty("image_url")
    val imageUrl: String,

    @JsonProperty("url")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    val url: String?,

    @JsonProperty("appid")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    val appId: String?,

    @JsonProperty("pagepath")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    val pagePath: String?,
)
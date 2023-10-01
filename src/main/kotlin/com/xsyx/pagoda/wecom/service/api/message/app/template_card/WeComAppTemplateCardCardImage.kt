package com.xsyx.pagoda.wecom.service.api.message.app.template_card

import com.fasterxml.jackson.annotation.JsonProperty

data class WeComAppTemplateCardCardImage(
    @JsonProperty("url")
    val url: String,

    @JsonProperty("aspect_ratio")
    val aspectRatio: String = "1.3"
)
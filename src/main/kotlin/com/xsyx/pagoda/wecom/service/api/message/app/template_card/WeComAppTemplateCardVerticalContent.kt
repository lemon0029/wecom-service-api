package com.xsyx.pagoda.wecom.service.api.message.app.template_card

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty

data class WeComAppTemplateCardVerticalContent(
    @JsonProperty("title")
    val title: String,

    @JsonProperty("desc")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    val description: String? = null,
)

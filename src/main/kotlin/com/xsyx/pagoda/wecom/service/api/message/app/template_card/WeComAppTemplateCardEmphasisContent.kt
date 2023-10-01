package com.xsyx.pagoda.wecom.service.api.message.app.template_card

import com.fasterxml.jackson.annotation.JsonProperty

data class WeComAppTemplateCardEmphasisContent(
    @JsonProperty("title")
    val title: String,

    @JsonProperty("desc")
    val description: String,
)
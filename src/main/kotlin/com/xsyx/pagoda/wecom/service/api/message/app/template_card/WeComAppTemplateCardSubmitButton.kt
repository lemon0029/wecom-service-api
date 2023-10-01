package com.xsyx.pagoda.wecom.service.api.message.app.template_card

import com.fasterxml.jackson.annotation.JsonProperty

data class WeComAppTemplateCardSubmitButton(
    @JsonProperty("text")
    val text: String,

    @JsonProperty("key")
    val key: String,
)
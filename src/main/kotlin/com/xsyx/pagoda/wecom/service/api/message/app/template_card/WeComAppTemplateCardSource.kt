package com.xsyx.pagoda.wecom.service.api.message.app.template_card

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty

data class WeComAppTemplateCardSource(
    @JsonProperty("icon_url")
    val iconUrl: String,

    @JsonProperty("desc")
    val description: String?,

    @JsonProperty("desc_color")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    val descriptionColor: Int? = null
)
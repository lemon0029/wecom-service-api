package com.xsyx.pagoda.wecom.service.api.message.app.template_card

import com.fasterxml.jackson.annotation.JsonProperty

data class WeComAppTemplateCardCheckbox(
    @JsonProperty("question_key")
    val questionKey: String,

    @JsonProperty("mode")
    val mode: Int = 1,

    @JsonProperty("option_list")
    val options: List<Option>
) {
    data class Option(
        @JsonProperty("id")
        val id: String,

        @JsonProperty("text")
        val text: String,

        @JsonProperty("is_checked")
        val checked: Boolean
    )
}
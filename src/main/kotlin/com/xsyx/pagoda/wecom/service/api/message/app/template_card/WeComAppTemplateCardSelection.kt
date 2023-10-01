package com.xsyx.pagoda.wecom.service.api.message.app.template_card

import com.fasterxml.jackson.annotation.JsonProperty

data class WeComAppTemplateCardSelection(
    @JsonProperty("question_key")
    val questionKey: String,

    @JsonProperty("title")
    val title: String,

    @JsonProperty("selected_id")
    val selectedId: String,

    @JsonProperty("option_list")
    val options: List<Option>
) {
    data class Option(
        @JsonProperty("id")
        val id: String,

        @JsonProperty("text")
        val text: String
    )
}
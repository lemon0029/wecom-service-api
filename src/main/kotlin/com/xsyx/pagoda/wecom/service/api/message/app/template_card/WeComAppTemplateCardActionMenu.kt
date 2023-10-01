package com.xsyx.pagoda.wecom.service.api.message.app.template_card

import com.fasterxml.jackson.annotation.JsonProperty


data class WeComAppTemplateCardActionMenu(
    @JsonProperty("desc")
    val description: String?,

    @JsonProperty("action_list")
    val actions: List<Item>
) {
    data class Item(
        @JsonProperty("key")
        val key: String,

        @JsonProperty("text")
        val text: String
    )
}
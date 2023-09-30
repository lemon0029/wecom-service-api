package com.xsyx.pagoda.wecom.service.api.network.base

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.databind.JsonSerializer
import com.fasterxml.jackson.databind.SerializerProvider
import com.xsyx.pagoda.wecom.service.api.network.dto.request.WeComAppMessageSendRequest
import com.xsyx.pagoda.wecom.service.api.network.dto.request.WeComGroupBotMessageSendRequest
import kotlin.reflect.KProperty0
import kotlin.reflect.full.findAnnotation
import kotlin.reflect.full.primaryConstructor


class WeComGroupBotMessageSendRequestSerializer : JsonSerializer<WeComGroupBotMessageSendRequest>() {

    override fun serialize(
        value: WeComGroupBotMessageSendRequest,
        gen: JsonGenerator,
        serializers: SerializerProvider
    ) {
        gen.writeStartObject()

        gen.writeStringField(introspectParameterName(value::messageType), value.messageType.value)
        gen.writeObjectField(value.messageType.value, value.content)

        gen.writeEndObject()
    }

    private fun introspectParameterName(kProperty0: KProperty0<*>): String {
        val parameters = WeComAppMessageSendRequest::class.primaryConstructor?.parameters!!
        val parameter = parameters.firstOrNull { it.name == kProperty0.name }!!

        return parameter.findAnnotation<JsonProperty>()?.value ?: ""
    }
}
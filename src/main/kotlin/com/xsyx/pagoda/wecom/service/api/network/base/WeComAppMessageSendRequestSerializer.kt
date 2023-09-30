package com.xsyx.pagoda.wecom.service.api.network.base

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.databind.JsonSerializer
import com.fasterxml.jackson.databind.SerializerProvider
import com.xsyx.pagoda.wecom.service.api.network.dto.request.WeComAppMessageSendRequest
import kotlin.reflect.KProperty0
import kotlin.reflect.full.findAnnotation
import kotlin.reflect.full.primaryConstructor


class WeComAppMessageSendRequestSerializer : JsonSerializer<WeComAppMessageSendRequest>() {

    override fun serialize(
        value: WeComAppMessageSendRequest,
        gen: JsonGenerator,
        serializers: SerializerProvider
    ) {
        gen.writeStartObject()
        gen.writeStringField(introspectParameterName(value::toUsers), value.toUsers.joinToString("|"))
        gen.writeStringField(introspectParameterName(value::toParties), value.toParties?.joinToString("|"))
        gen.writeStringField(introspectParameterName(value::toTags), value.toTags?.joinToString("|"))
        gen.writeNumberField(introspectParameterName(value::agentId), value.agentId)

        gen.writeNumberField(introspectParameterName(value::safe), value.safe)
        gen.writeNumberField(introspectParameterName(value::enableIdTrans), value.enableIdTrans)
        gen.writeNumberField(introspectParameterName(value::enableDuplicateCheck), value.enableDuplicateCheck)
        gen.writeNumberField(introspectParameterName(value::duplicateCheckInterval), value.duplicateCheckInterval)

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
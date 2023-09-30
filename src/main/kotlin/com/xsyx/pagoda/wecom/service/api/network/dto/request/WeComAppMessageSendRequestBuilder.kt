package com.xsyx.pagoda.wecom.service.api.network.dto.request

import com.xsyx.pagoda.wecom.service.api.message.WeComAppMessage
import kotlin.properties.Delegates

class WeComAppMessageSendRequestBuilder {

    private var appAgentId by Delegates.notNull<Int>()
    private lateinit var toUsers: List<String>
    private lateinit var message: WeComAppMessage

    fun withToUsers(vararg user: String): WeComAppMessageSendRequestBuilder {
        this.toUsers = user.toList()
        return this
    }

    fun withAppAgentId(appAgentId: Int): WeComAppMessageSendRequestBuilder {
        this.appAgentId = appAgentId
        return this
    }

    fun withMessage(message: WeComAppMessage): WeComAppMessageSendRequestBuilder {
        this.message = message
        return this
    }

    fun build(): WeComAppMessageSendRequest {
        return WeComAppMessageSendRequest(toUsers, null, null, appAgentId, message)
    }
}
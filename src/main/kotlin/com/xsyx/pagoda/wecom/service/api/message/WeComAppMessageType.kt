package com.xsyx.pagoda.wecom.service.api.message

enum class WeComAppMessageType(val value: String) {

    /**
     * 文本消息
     */
    TEXT("text"),

    /**
     * 图片消息
     */
    IMAGE("image"),

    /**
     * 语音消息
     */
    VOICE("voice"),

    /**
     * 视频消息
     */
    VIDEO("video"),

    /**
     * 文件消息
     */
    FILE("file"),

    /**
     * 文本卡片消息
     */
    TEXT_CARD("textcard"),

    /**
     * 图文消息
     */
    NEWS("news"),

    /**
     * 图文消息
     */
    MP_NEWS("mpnews"),

    /**
     * 文本消息
     */
    MARKDOWN("markdown"),

    /**
     * 模版卡片
     */
    TEMPLATE_CARD("template_card")
}
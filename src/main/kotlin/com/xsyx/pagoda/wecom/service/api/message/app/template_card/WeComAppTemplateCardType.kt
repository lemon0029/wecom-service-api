package com.xsyx.pagoda.wecom.service.api.message.app.template_card

enum class WeComAppTemplateCardType(val value: String) {
    /**
     * 文本通知型
     */
    TEXT_NOTICE("text_notice"),

    /**
     * 图文展示型
     */
    NEWS_NOTICE("news_notice"),

    /**
     * 按钮交互型
     */
    BUTTON_INTERACTION("button_interaction"),

    /**
     * 投票选择型
     */
    VOTE_INTERACTION("vote_interaction"),

    /**
     * 多项选择型
     */
    MULTIPLE_INTERACTION("multiple_interaction")
}
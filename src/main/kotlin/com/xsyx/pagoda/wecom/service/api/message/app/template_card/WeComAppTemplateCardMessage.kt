package com.xsyx.pagoda.wecom.service.api.message.app.template_card

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty

data class WeComAppTemplateCardMessage(
    /**
     * 模版卡片类型
     */
    @JsonProperty("card_type")
    val type: WeComAppTemplateCardType,

    /**
     * 任务标识
     */
    @JsonProperty("task_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    val taskId: String? = null,

    /**
     * 卡片来源
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("source")
    val source: WeComAppTemplateCardSource? = null,

    /**
     * 一级标题
     */
    @JsonProperty("main_title")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    val mainTitle: WeComAppTemplateCardMainTitle? = null,

    /**
     * 二级标题
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("sub_title_text")
    val subTitleText: String? = null,


    /**
     * 卡片右上角更多操作按钮
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("action_menu")
    val actionMenu: WeComAppTemplateCardActionMenu? = null,

    /**
     * 引用文献
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("quote_area")
    val quoteArea: WeComAppTemplateCardQuoteArea? = null,

    /**
     * 左图右文
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("image_text_area")
    val imageTextArea: WeComAppTemplateCardImageTextArea? = null,

    /**
     * 卡片图片
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("card_image")
    val cardImage: WeComAppTemplateCardCardImage? = null,

    /**
     * 关键数据
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("emphasis_content")
    val emphasisContent: WeComAppTemplateCardEmphasisContent? = null,

    /**
     * 二级标题+文本列表
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("horizontal_content_list")
    val horizontalContents: List<WeComAppTemplateCardHorizontalContent>? = null,

    /**
     * 卡片二级垂直内容
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("vertical_content_list")
    val verticalContents: List<WeComAppTemplateCardVerticalContent>? = null,

    /**
     * 跳转指引样式的列表
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("jump_list")
    val jumps: List<WeComAppTemplateCardJump>? = null,

    /**
     * 按钮下拉选择列表
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("button_selection")
    val buttonSelections: List<WeComAppTemplateCardButtonSelection>? = null,

    /**
     * 按钮列表
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("button_list")
    val buttons: List<WeComAppTemplateCardButton>? = null,

    /**
     * 整体卡片的点击跳转事件
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("card_action")
    val cardAction: WeComAppTemplateCardCardAction? = null,

    /**
     * 选择题
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("checkbox")
    val checkbox: WeComAppTemplateCardCheckbox? = null,

    /**
     * 下拉选择列表
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("select_list")
    val selections: List<WeComAppTemplateCardSelection>? = null,

    /**
     * 结果提交按钮
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("submit_button")
    val submitButton: WeComAppTemplateCardSubmitButton? = null
)
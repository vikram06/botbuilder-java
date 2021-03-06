/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.bot.schema.models;

import org.joda.time.DateTime;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * An Activity is the basic communication type for the Bot Framework 3.0
 * protocol.
 */
public class Activity {
    /**
     * The type of the activity. Possible values include: 'message',
     * 'contactRelationUpdate', 'conversationUpdate', 'typing', 'ping',
     * 'endOfConversation', 'event', 'invoke', 'deleteUserData',
     * 'messageUpdate', 'messageDelete', 'installationUpdate',
     * 'messageReaction', 'suggestion'.
     */
    @JsonProperty(value = "type")
    private ActivityTypes type;

    /**
     * ID of this activity.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * UTC Time when message was sent (set by service).
     */
    @JsonProperty(value = "timestamp")
    private DateTime timestamp;

    /**
     * Local time when message was sent (set by client, Ex:
     * 2016-09-23T13:07:49.4714686-07:00).
     */
    @JsonProperty(value = "localTimestamp")
    private DateTime localTimestamp;

    /**
     * Service endpoint where operations concerning the activity may be
     * performed.
     */
    @JsonProperty(value = "serviceUrl")
    private String serviceUrl;

    /**
     * ID of the channel where the activity was sent.
     */
    @JsonProperty(value = "channelId")
    private String channelId;

    /**
     * Sender address.
     */
    @JsonProperty(value = "from")
    private ChannelAccount from;

    /**
     * Conversation.
     */
    @JsonProperty(value = "conversation")
    private ConversationAccount conversation;

    /**
     * (Outbound to bot only) Bot's address that received the message.
     */
    @JsonProperty(value = "recipient")
    private ChannelAccount recipient;

    /**
     * Format of text fields Default:markdown. Possible values include:
     * 'markdown', 'plain', 'xml'.
     */
    @JsonProperty(value = "textFormat")
    private TextFormatTypes textFormat;

    /**
     * Hint for how to deal with multiple attachments. Default:list. Possible
     * values include: 'list', 'carousel'.
     */
    @JsonProperty(value = "attachmentLayout")
    private AttachmentLayoutTypes attachmentLayout;

    /**
     * Members added to the conversation.
     */
    @JsonProperty(value = "membersAdded")
    private List<ChannelAccount> membersAdded;

    /**
     * Members removed from the conversation.
     */
    @JsonProperty(value = "membersRemoved")
    private List<ChannelAccount> membersRemoved;

    /**
     * Reactions added to the activity.
     */
    @JsonProperty(value = "reactionsAdded")
    private List<MessageReaction> reactionsAdded;

    /**
     * Reactions removed from the activity.
     */
    @JsonProperty(value = "reactionsRemoved")
    private List<MessageReaction> reactionsRemoved;

    /**
     * The conversation's updated topic name.
     */
    @JsonProperty(value = "topicName")
    private String topicName;

    /**
     * True if prior history of the channel is disclosed.
     */
    @JsonProperty(value = "historyDisclosed")
    private Boolean historyDisclosed;

    /**
     * The language code of the Text field.
     */
    @JsonProperty(value = "locale")
    private String locale;

    /**
     * Content for the message.
     */
    @JsonProperty(value = "text")
    private String text;

    /**
     * SSML Speak for TTS audio response.
     */
    @JsonProperty(value = "speak")
    private String speak;

    /**
     * Input hint to the channel on what the bot is expecting. Possible values
     * include: 'acceptingInput', 'ignoringInput', 'expectingInput'.
     */
    @JsonProperty(value = "inputHint")
    private InputHints inputHint;

    /**
     * Text to display if the channel cannot render cards.
     */
    @JsonProperty(value = "summary")
    private String summary;

    /**
     * SuggestedActions are used to provide keyboard/quickreply like behavior
     * in many clients.
     */
    @JsonProperty(value = "suggestedActions")
    private SuggestedActions suggestedActions;

    /**
     * Attachments.
     */
    @JsonProperty(value = "attachments")
    private List<Attachment> attachments;

    /**
     * Collection of Entity objects, each of which contains metadata about this
     * activity. Each Entity object is typed.
     */
    @JsonProperty(value = "entities")
    private List<Entity> entities;

    /**
     * Channel-specific payload.
     */
    @JsonProperty(value = "channelData")
    private Object channelData;

    /**
     * ContactAdded/Removed action.
     */
    @JsonProperty(value = "action")
    private String action;

    /**
     * The original ID this message is a response to.
     */
    @JsonProperty(value = "replyToId")
    private String replyToId;

    /**
     * Open-ended value.
     */
    @JsonProperty(value = "value")
    private Object value;

    /**
     * Name of the operation to invoke or the name of the event.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Reference to another conversation or activity.
     */
    @JsonProperty(value = "relatesTo")
    private ConversationReference relatesTo;

    /**
     * Code indicating why the conversation has ended. Possible values include:
     * 'unknown', 'completedSuccessfully', 'userCancelled', 'botTimedOut',
     * 'botIssuedInvalidMessage', 'channelFailed'.
     */
    @JsonProperty(value = "code")
    private EndOfConversationCodes code;

    /**
     * DateTime to expire the activity as ISO 8601 encoded datetime.
     */
    @JsonProperty(value = "expiration")
    private DateTime expiration;

    /**
     * Importance of this activity
     * {Low|Normal|High}, null value indicates Normal importance see
     * ActivityImportance).
     */
    @JsonProperty(value = "importance")
    private String importance;

    /**
     * Hint to describe how this activity should be delivered.
     * Currently: null or "Default" = default delivery
     * "Notification" = notification semantics.
     */
    @JsonProperty(value = "deliveryMode")
    private String deliveryMode;

    /**
     * TextHighlight in the activity represented in the ReplyToId property.
     */
    @JsonProperty(value = "textHighlights")
    private List<TextHighlight> textHighlights;

    /**
     * Get the type value.
     *
     * @return the type value
     */
    public ActivityTypes type() {
        return this.type;
    }

    /**
     * Set the type value.
     *
     * @param type the type value to set
     * @return the Activity object itself.
     */
    public Activity withType(ActivityTypes type) {
        this.type = type;
        return this;
    }

    /**
     * Get the id value.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id value.
     *
     * @param id the id value to set
     * @return the Activity object itself.
     */
    public Activity withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the timestamp value.
     *
     * @return the timestamp value
     */
    public DateTime timestamp() {
        return this.timestamp;
    }

    /**
     * Set the timestamp value.
     *
     * @param timestamp the timestamp value to set
     * @return the Activity object itself.
     */
    public Activity withTimestamp(DateTime timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * Get the localTimestamp value.
     *
     * @return the localTimestamp value
     */
    public DateTime localTimestamp() {
        return this.localTimestamp;
    }

    /**
     * Set the localTimestamp value.
     *
     * @param localTimestamp the localTimestamp value to set
     * @return the Activity object itself.
     */
    public Activity withLocalTimestamp(DateTime localTimestamp) {
        this.localTimestamp = localTimestamp;
        return this;
    }

    /**
     * Get the serviceUrl value.
     *
     * @return the serviceUrl value
     */
    public String serviceUrl() {
        return this.serviceUrl;
    }

    /**
     * Set the serviceUrl value.
     *
     * @param serviceUrl the serviceUrl value to set
     * @return the Activity object itself.
     */
    public Activity withServiceUrl(String serviceUrl) {
        this.serviceUrl = serviceUrl;
        return this;
    }

    /**
     * Get the channelId value.
     *
     * @return the channelId value
     */
    public String channelId() {
        return this.channelId;
    }

    /**
     * Set the channelId value.
     *
     * @param channelId the channelId value to set
     * @return the Activity object itself.
     */
    public Activity withChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }

    /**
     * Get the from value.
     *
     * @return the from value
     */
    public ChannelAccount from() {
        return this.from;
    }

    /**
     * Set the from value.
     *
     * @param from the from value to set
     * @return the Activity object itself.
     */
    public Activity withFrom(ChannelAccount from) {
        this.from = from;
        return this;
    }

    /**
     * Get the conversation value.
     *
     * @return the conversation value
     */
    public ConversationAccount conversation() {
        return this.conversation;
    }

    /**
     * Set the conversation value.
     *
     * @param conversation the conversation value to set
     * @return the Activity object itself.
     */
    public Activity withConversation(ConversationAccount conversation) {
        this.conversation = conversation;
        return this;
    }

    /**
     * Get the recipient value.
     *
     * @return the recipient value
     */
    public ChannelAccount recipient() {
        return this.recipient;
    }

    /**
     * Set the recipient value.
     *
     * @param recipient the recipient value to set
     * @return the Activity object itself.
     */
    public Activity withRecipient(ChannelAccount recipient) {
        this.recipient = recipient;
        return this;
    }

    /**
     * Get the textFormat value.
     *
     * @return the textFormat value
     */
    public TextFormatTypes textFormat() {
        return this.textFormat;
    }

    /**
     * Set the textFormat value.
     *
     * @param textFormat the textFormat value to set
     * @return the Activity object itself.
     */
    public Activity withTextFormat(TextFormatTypes textFormat) {
        this.textFormat = textFormat;
        return this;
    }

    /**
     * Get the attachmentLayout value.
     *
     * @return the attachmentLayout value
     */
    public AttachmentLayoutTypes attachmentLayout() {
        return this.attachmentLayout;
    }

    /**
     * Set the attachmentLayout value.
     *
     * @param attachmentLayout the attachmentLayout value to set
     * @return the Activity object itself.
     */
    public Activity withAttachmentLayout(AttachmentLayoutTypes attachmentLayout) {
        this.attachmentLayout = attachmentLayout;
        return this;
    }

    /**
     * Get the membersAdded value.
     *
     * @return the membersAdded value
     */
    public List<ChannelAccount> membersAdded() {
        return this.membersAdded;
    }

    /**
     * Set the membersAdded value.
     *
     * @param membersAdded the membersAdded value to set
     * @return the Activity object itself.
     */
    public Activity withMembersAdded(List<ChannelAccount> membersAdded) {
        this.membersAdded = membersAdded;
        return this;
    }

    /**
     * Get the membersRemoved value.
     *
     * @return the membersRemoved value
     */
    public List<ChannelAccount> membersRemoved() {
        return this.membersRemoved;
    }

    /**
     * Set the membersRemoved value.
     *
     * @param membersRemoved the membersRemoved value to set
     * @return the Activity object itself.
     */
    public Activity withMembersRemoved(List<ChannelAccount> membersRemoved) {
        this.membersRemoved = membersRemoved;
        return this;
    }

    /**
     * Get the reactionsAdded value.
     *
     * @return the reactionsAdded value
     */
    public List<MessageReaction> reactionsAdded() {
        return this.reactionsAdded;
    }

    /**
     * Set the reactionsAdded value.
     *
     * @param reactionsAdded the reactionsAdded value to set
     * @return the Activity object itself.
     */
    public Activity withReactionsAdded(List<MessageReaction> reactionsAdded) {
        this.reactionsAdded = reactionsAdded;
        return this;
    }

    /**
     * Get the reactionsRemoved value.
     *
     * @return the reactionsRemoved value
     */
    public List<MessageReaction> reactionsRemoved() {
        return this.reactionsRemoved;
    }

    /**
     * Set the reactionsRemoved value.
     *
     * @param reactionsRemoved the reactionsRemoved value to set
     * @return the Activity object itself.
     */
    public Activity withReactionsRemoved(List<MessageReaction> reactionsRemoved) {
        this.reactionsRemoved = reactionsRemoved;
        return this;
    }

    /**
     * Get the topicName value.
     *
     * @return the topicName value
     */
    public String topicName() {
        return this.topicName;
    }

    /**
     * Set the topicName value.
     *
     * @param topicName the topicName value to set
     * @return the Activity object itself.
     */
    public Activity withTopicName(String topicName) {
        this.topicName = topicName;
        return this;
    }

    /**
     * Get the historyDisclosed value.
     *
     * @return the historyDisclosed value
     */
    public Boolean historyDisclosed() {
        return this.historyDisclosed;
    }

    /**
     * Set the historyDisclosed value.
     *
     * @param historyDisclosed the historyDisclosed value to set
     * @return the Activity object itself.
     */
    public Activity withHistoryDisclosed(Boolean historyDisclosed) {
        this.historyDisclosed = historyDisclosed;
        return this;
    }

    /**
     * Get the locale value.
     *
     * @return the locale value
     */
    public String locale() {
        return this.locale;
    }

    /**
     * Set the locale value.
     *
     * @param locale the locale value to set
     * @return the Activity object itself.
     */
    public Activity withLocale(String locale) {
        this.locale = locale;
        return this;
    }

    /**
     * Get the text value.
     *
     * @return the text value
     */
    public String text() {
        return this.text;
    }

    /**
     * Set the text value.
     *
     * @param text the text value to set
     * @return the Activity object itself.
     */
    public Activity withText(String text) {
        this.text = text;
        return this;
    }

    /**
     * Get the speak value.
     *
     * @return the speak value
     */
    public String speak() {
        return this.speak;
    }

    /**
     * Set the speak value.
     *
     * @param speak the speak value to set
     * @return the Activity object itself.
     */
    public Activity withSpeak(String speak) {
        this.speak = speak;
        return this;
    }

    /**
     * Get the inputHint value.
     *
     * @return the inputHint value
     */
    public InputHints inputHint() {
        return this.inputHint;
    }

    /**
     * Set the inputHint value.
     *
     * @param inputHint the inputHint value to set
     * @return the Activity object itself.
     */
    public Activity withInputHint(InputHints inputHint) {
        this.inputHint = inputHint;
        return this;
    }

    /**
     * Get the summary value.
     *
     * @return the summary value
     */
    public String summary() {
        return this.summary;
    }

    /**
     * Set the summary value.
     *
     * @param summary the summary value to set
     * @return the Activity object itself.
     */
    public Activity withSummary(String summary) {
        this.summary = summary;
        return this;
    }

    /**
     * Get the suggestedActions value.
     *
     * @return the suggestedActions value
     */
    public SuggestedActions suggestedActions() {
        return this.suggestedActions;
    }

    /**
     * Set the suggestedActions value.
     *
     * @param suggestedActions the suggestedActions value to set
     * @return the Activity object itself.
     */
    public Activity withSuggestedActions(SuggestedActions suggestedActions) {
        this.suggestedActions = suggestedActions;
        return this;
    }

    /**
     * Get the attachments value.
     *
     * @return the attachments value
     */
    public List<Attachment> attachments() {
        return this.attachments;
    }

    /**
     * Set the attachments value.
     *
     * @param attachments the attachments value to set
     * @return the Activity object itself.
     */
    public Activity withAttachments(List<Attachment> attachments) {
        this.attachments = attachments;
        return this;
    }

    /**
     * Get the entities value.
     *
     * @return the entities value
     */
    public List<Entity> entities() {
        return this.entities;
    }

    /**
     * Set the entities value.
     *
     * @param entities the entities value to set
     * @return the Activity object itself.
     */
    public Activity withEntities(List<Entity> entities) {
        this.entities = entities;
        return this;
    }

    /**
     * Get the channelData value.
     *
     * @return the channelData value
     */
    public Object channelData() {
        return this.channelData;
    }

    /**
     * Set the channelData value.
     *
     * @param channelData the channelData value to set
     * @return the Activity object itself.
     */
    public Activity withChannelData(Object channelData) {
        this.channelData = channelData;
        return this;
    }

    /**
     * Get the action value.
     *
     * @return the action value
     */
    public String action() {
        return this.action;
    }

    /**
     * Set the action value.
     *
     * @param action the action value to set
     * @return the Activity object itself.
     */
    public Activity withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * Get the replyToId value.
     *
     * @return the replyToId value
     */
    public String replyToId() {
        return this.replyToId;
    }

    /**
     * Set the replyToId value.
     *
     * @param replyToId the replyToId value to set
     * @return the Activity object itself.
     */
    public Activity withReplyToId(String replyToId) {
        this.replyToId = replyToId;
        return this;
    }

    /**
     * Get the value value.
     *
     * @return the value value
     */
    public Object value() {
        return this.value;
    }

    /**
     * Set the value value.
     *
     * @param value the value value to set
     * @return the Activity object itself.
     */
    public Activity withValue(Object value) {
        this.value = value;
        return this;
    }

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set
     * @return the Activity object itself.
     */
    public Activity withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the relatesTo value.
     *
     * @return the relatesTo value
     */
    public ConversationReference relatesTo() {
        return this.relatesTo;
    }

    /**
     * Set the relatesTo value.
     *
     * @param relatesTo the relatesTo value to set
     * @return the Activity object itself.
     */
    public Activity withRelatesTo(ConversationReference relatesTo) {
        this.relatesTo = relatesTo;
        return this;
    }

    /**
     * Get the code value.
     *
     * @return the code value
     */
    public EndOfConversationCodes code() {
        return this.code;
    }

    /**
     * Set the code value.
     *
     * @param code the code value to set
     * @return the Activity object itself.
     */
    public Activity withCode(EndOfConversationCodes code) {
        this.code = code;
        return this;
    }

    /**
     * Get the expiration value.
     *
     * @return the expiration value
     */
    public DateTime expiration() {
        return this.expiration;
    }

    /**
     * Set the expiration value.
     *
     * @param expiration the expiration value to set
     * @return the Activity object itself.
     */
    public Activity withExpiration(DateTime expiration) {
        this.expiration = expiration;
        return this;
    }

    /**
     * Get the importance value.
     *
     * @return the importance value
     */
    public String importance() {
        return this.importance;
    }

    /**
     * Set the importance value.
     *
     * @param importance the importance value to set
     * @return the Activity object itself.
     */
    public Activity withImportance(String importance) {
        this.importance = importance;
        return this;
    }

    /**
     * Get the deliveryMode value.
     *
     * @return the deliveryMode value
     */
    public String deliveryMode() {
        return this.deliveryMode;
    }

    /**
     * Set the deliveryMode value.
     *
     * @param deliveryMode the deliveryMode value to set
     * @return the Activity object itself.
     */
    public Activity withDeliveryMode(String deliveryMode) {
        this.deliveryMode = deliveryMode;
        return this;
    }

    /**
     * Get the textHighlights value.
     *
     * @return the textHighlights value
     */
    public List<TextHighlight> textHighlights() {
        return this.textHighlights;
    }

    /**
     * Set the textHighlights value.
     *
     * @param textHighlights the textHighlights value to set
     * @return the Activity object itself.
     */
    public Activity withTextHighlights(List<TextHighlight> textHighlights) {
        this.textHighlights = textHighlights;
        return this;
    }

}

package com.bot.balgebunbot.service.state;

import com.linecorp.bot.model.message.Message;
import com.linecorp.bot.model.message.TextMessage;

public class Messages {

    public static final Message HELP = new TextMessage("[PH]");

    public static final Message INVALID = new TextMessage("Invalid command! Please type /help to show all valid command");

    public static final Message ADD_ORDER_FAILED = new TextMessage("[PH]");

    public static final Message ADD_ORDER_SUCCESS = new TextMessage("[PH]");

    public static final Message REMOVE_ORDER_SUCCESS = new TextMessage("[PH]");

    public static final Message REMOVE_ORDER_FAILED = new TextMessage("[PH]");

    public static final Message PAYMENT_FAILED = new TextMessage("[PH]");

    public static final Message PAYMENT_SUCCESS = new TextMessage("[PH]");

    public static final Message REGISTER_SUCCESS = new TextMessage("[PH]");

    public static final Message REGISTER_FAILED = new TextMessage("[PH]");

    public static final Message SHOP_OPENED = new TextMessage("[PH]");

    public static final Message SHOP_FAILED = new TextMessage("[PH]");

    public static final Message ADD_ITEM_SUCCESS = new TextMessage("[PH]");

    public static final Message ADD_ITEM_FAILED = new TextMessage("[PH]");

    public static final Message ORDER_ACCEPTED = new TextMessage("[PH]");

    public static final Message ORDER_COOKING = new TextMessage("[PH]");

    public static final Message ORDER_FINISHED = new TextMessage("[PH]");

    public static final Message ORDER_DELIVER = new TextMessage("[PH]");

    public static final Message ADD_PROMO_SUCCESS = new TextMessage("[PH]");

    public static final Message ADD_PROMO_FAILED = new TextMessage("[PH]");

    public static final Message REMOVE_PROMO_SUCCESS = new TextMessage("[PH]");

    public static final Message REMOVE_PROMO_FAILED = new TextMessage("[PH]");

    public static final Message CONFIRM_ORDER_SUCCESS = new TextMessage("[PH]");

    public static final Message CONFIRM_ORDER_FAILED = new TextMessage("[PH]");

    public static final Message SUBSCRIBE_SUCCESS = new TextMessage("[PH]");

    public static final Message SUBSCRIBE_FAILED = new TextMessage("[PH]");

    public static final Message NO_HISTORY = new TextMessage("[PH]");

    public static final Message NO_ORDER = new TextMessage("[PH]");

    public static final Message ADD_REVIEW_SUCCESS = new TextMessage("[PH]");

    public static final Message ADD_REVIEW_FAILED = new TextMessage("[PH]");

}

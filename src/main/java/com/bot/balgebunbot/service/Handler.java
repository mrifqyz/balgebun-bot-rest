package com.bot.balgebunbot.service;

import com.linecorp.bot.model.PushMessage;
import com.linecorp.bot.model.message.Message;

import java.util.List;

public interface Handler {
    List<Message> getResponse();
    List<PushMessage> getPushMessage();
}

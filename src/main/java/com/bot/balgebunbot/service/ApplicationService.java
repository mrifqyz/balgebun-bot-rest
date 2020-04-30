package com.bot.balgebunbot.service;

import com.linecorp.bot.model.PushMessage;
import com.linecorp.bot.model.message.Message;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ApplicationService implements Service {

    private Handler handler;

    public ApplicationService(Handler handler){
        this.handler = handler;
    }
    @Override
    public List<Message> getResponse() {
        return this.handler.getResponse();
    }

    @Override
    public List<PushMessage> getPushMessage() {
        return this.handler.getPushMessage();
    }

    @Override
    public void setHandler(Handler handler) {
        this.handler = handler;
    }
}

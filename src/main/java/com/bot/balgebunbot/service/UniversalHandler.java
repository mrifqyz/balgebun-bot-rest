package com.bot.balgebunbot.service;

import com.linecorp.bot.model.PushMessage;
import com.linecorp.bot.model.message.Message;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UniversalHandler implements Handler{

    private List<Message> responses;
    private List<PushMessage> pushMessages;

    public UniversalHandler(){
        this.responses =  new ArrayList<>();
    }

    public void setResponses(List<Message> responses){
        this.responses = responses;
    }

    @Override
    public List<Message> getResponse() {
        return this.responses;
    }

    @Override
    public List<PushMessage> getPushMessage() {
        return this.pushMessages;
    }

    public void setPushMessages(List<PushMessage> pushMessages){
        this.pushMessages =  pushMessages;
    }
}

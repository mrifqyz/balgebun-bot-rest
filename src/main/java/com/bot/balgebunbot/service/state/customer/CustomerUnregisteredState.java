package com.bot.balgebunbot.service.state.customer;

import com.bot.balgebunbot.service.state.Messages;
import com.linecorp.bot.model.message.Message;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CustomerUnregisteredState extends CustomerState {

    public static final String DB_COL_NAME ="CUSTOMER UNREGISTERED";

    public CustomerUnregisteredState(){
        this.responses = new ArrayList<>();
    }

    @Override
    public List<Message> register() {
        return responses;
    }

    @Override
    public List<Message> help() {
        responses.add(Messages.HELP);
        return responses;
    }

    @Override
    public List<Message> addOrder() {
        return responses;
    }

    @Override
    public List<Message> cancel() {
        return responses;
    }

    @Override
    public List<Message> getOrderStatus() {
        return responses;
    }

    @Override
    public List<Message> getHistory() {
        return responses;
    }

    @Override
    public List<Message> removeOrder() {
        return responses;
    }

    @Override
    public List<Message> clearResponses() {
        return responses;
    }

    @Override
    public List<Message> subscribe() {
        return responses;
    }

    @Override
    public List<Message> addReview() {
        return responses;
    }

    @Override
    public List<Message> confirmOrder() {
        return responses;
    }

    @Override
    public List<Message> payOrder() {
        return responses;
    }
}

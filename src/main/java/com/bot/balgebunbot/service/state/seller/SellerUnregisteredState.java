package com.bot.balgebunbot.service.state.seller;

import com.linecorp.bot.model.message.Message;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class SellerUnregisteredState extends SellerState {

    public static final String DB_COL_NAME = "SELLER UNREGISTERED";

    public SellerUnregisteredState(){
        this.responses = new ArrayList<>();
    }

    @Override
    public List<Message> register() {
        return responses;
    }

    @Override
    public List<Message> help() {
        return responses;
    }

    @Override
    public List<Message> cancel() {
        return responses;
    }

    @Override
    public List<Message> getOrders() {
        return responses;
    }

    @Override
    public List<Message> getHistory() {
        return responses;
    }

    @Override
    public List<Message> addMenu() {
        return responses;
    }

    @Override
    public List<Message> removeMenu() {
        return responses;
    }

    @Override
    public List<Message> clearResponses() {
        return responses;
    }

    @Override
    public List<Message> addPromo() {
        return responses;
    }

    @Override
    public List<Message> removePromo() {
        return responses;
    }

    @Override
    public List<Message> getReview() {
        return responses;
    }

    @Override
    public List<Message> notifyOrderDone() {
        return responses;
    }

    @Override
    public List<Message> cookOrder() {
        return responses;
    }
}

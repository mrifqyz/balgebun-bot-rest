package com.bot.balgebunbot.service.state.customer;

import com.bot.balgebunbot.service.state.State;
import com.linecorp.bot.model.message.Message;

import java.util.List;

public abstract class CustomerState implements State {

    protected List<Message> responses;

    public abstract List<Message> register();

    public abstract List<Message> help();

    public abstract List<Message> addOrder();

    public abstract List<Message> cancel();

    public abstract List<Message> getOrderStatus();

    public abstract List<Message> getHistory();

    public abstract List<Message> removeOrder();

    public abstract List<Message> clearResponses();

    public abstract List<Message> subscribe();

    public abstract List<Message> addReview();

    public abstract List<Message> confirmOrder();

    public abstract List<Message> payOrder();
}

package com.bot.balgebunbot.service.state.seller;

import com.bot.balgebunbot.service.state.State;
import com.linecorp.bot.model.message.Message;

import java.util.List;

public abstract class SellerState implements State {

    protected List<Message> responses;

    public abstract List<Message> register();

    public abstract List<Message> help();

    public abstract List<Message> cancel();

    public abstract List<Message> getOrders();

    public abstract List<Message> getHistory();

    public abstract List<Message> addMenu();

    public abstract List<Message> removeMenu();

    public abstract List<Message> clearResponses();

    public abstract List<Message> addPromo();

    public abstract List<Message> removePromo();

    public abstract List<Message> getReview();

    public abstract List<Message> notifyOrderDone();

    public abstract List<Message> cookOrder();
}

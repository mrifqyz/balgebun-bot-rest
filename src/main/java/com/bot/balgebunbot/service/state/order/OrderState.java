package com.bot.balgebunbot.service.state.order;

import com.bot.balgebunbot.service.state.State;
import com.linecorp.bot.model.message.Message;

import java.util.List;

public abstract class OrderState implements State {

    protected List<Message> responses;

    public abstract List<Message> accept();

    public abstract List<Message> cook();

    public abstract List<Message> finishCooking();

    public abstract List<Message> delivered();
}

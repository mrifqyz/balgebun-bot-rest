package com.bot.balgebunbot.service.state.order;

import com.linecorp.bot.model.message.Message;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class OrderFinishedState extends OrderState{

    public static final String DB_COL_NAME = "ORDER FINISHED";

    public OrderFinishedState(){
        this.responses = new ArrayList<>();
    }

    @Override
    public List<Message> accept() {
        return responses;
    }

    @Override
    public List<Message> cook() {
        return responses;
    }

    @Override
    public List<Message> finishCooking() {
        return responses;
    }

    @Override
    public List<Message> delivered() {
        return responses;
    }
}

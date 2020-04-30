package com.bot.balgebunbot.service.state.order;

import com.linecorp.bot.model.message.Message;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OrderAcceptedStateTest {

    OrderAcceptedState orderAcceptedState;
    List<Message> messages;

    @BeforeEach
    void setUp() {
        orderAcceptedState = new OrderAcceptedState();
        messages = new ArrayList<>();
    }

    @Test
    void accept() {
        messages.clear();
        assertEquals(orderAcceptedState.accept(), messages);
    }

    @Test
    void cook() {
        messages.clear();
        assertEquals(orderAcceptedState.cook(), messages);
    }

    @Test
    void finishCooking() {
        messages.clear();
        assertEquals(orderAcceptedState.finishCooking(), messages);
    }

    @Test
    void delivered() {
        messages.clear();
        assertEquals(orderAcceptedState.delivered(), messages);
    }
}
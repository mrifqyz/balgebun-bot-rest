package com.bot.balgebunbot.service.state.order;

import com.linecorp.bot.model.message.Message;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OrderDeliveredStateTest {

    OrderDeliveredState orderDeliveredState;
    List<Message> messages;

    @BeforeEach
    void setUp() {
        orderDeliveredState = new OrderDeliveredState();
        messages = new ArrayList<>();
    }

    @Test
    void accept() {
        messages.clear();
        assertEquals(orderDeliveredState.accept(), messages);
    }

    @Test
    void cook() {
        messages.clear();
        assertEquals(orderDeliveredState.cook(), messages);
    }

    @Test
    void finishCooking() {
        messages.clear();
        assertEquals(orderDeliveredState.finishCooking(), messages);
    }

    @Test
    void delivered() {
        messages.clear();
        assertEquals(orderDeliveredState.delivered(), messages);
    }
}
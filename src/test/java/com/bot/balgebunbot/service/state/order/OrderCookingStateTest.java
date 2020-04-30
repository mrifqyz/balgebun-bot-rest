package com.bot.balgebunbot.service.state.order;

import com.linecorp.bot.model.message.Message;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OrderCookingStateTest {

    OrderCookingState orderCookingState;
    List<Message> messages;

    @BeforeEach
    void setUp() {
        orderCookingState = new OrderCookingState();
        messages = new ArrayList<>();
    }

    @Test
    void accept() {
        messages.clear();
        assertEquals(orderCookingState.accept(), messages);
    }

    @Test
    void cook() {
        messages.clear();
        assertEquals(orderCookingState.cook(), messages);
    }

    @Test
    void finishCooking() {
        messages.clear();
        assertEquals(orderCookingState.finishCooking(), messages);
    }

    @Test
    void delivered() {
        messages.clear();
        assertEquals(orderCookingState.delivered(), messages);
    }
}
package com.bot.balgebunbot.service.state.order;

import com.linecorp.bot.model.message.Message;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OrderFinishedStateTest {

    OrderFinishedState orderFinishedState;
    List<Message> messages;

    @BeforeEach
    void setUp() {
        orderFinishedState = new OrderFinishedState();
        messages = new ArrayList<>();
    }

    @Test
    void accept() {
        messages.clear();
        assertEquals(orderFinishedState.accept(), messages);
    }

    @Test
    void cook() {
        messages.clear();
        assertEquals(orderFinishedState.cook(), messages);
    }

    @Test
    void finishCooking() {
        messages.clear();
        assertEquals(orderFinishedState.finishCooking(), messages);
    }

    @Test
    void delivered() {
        messages.clear();
        assertEquals(orderFinishedState.delivered(), messages);
    }
}
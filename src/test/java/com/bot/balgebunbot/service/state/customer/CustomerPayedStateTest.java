package com.bot.balgebunbot.service.state.customer;

import com.linecorp.bot.model.message.Message;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CustomerPayedStateTest {

    CustomerPayedState customerPayedState;
    List<Message> messages;

    @BeforeEach
    void setUp() {
        customerPayedState = new CustomerPayedState();
        messages = new ArrayList<>();
    }

    @Test
    void register() {
        messages.clear();
        assertEquals(customerPayedState.register(), messages);
    }

    @Test
    void help() {
        messages.clear();
        assertEquals(customerPayedState.help(), messages);
    }

    @Test
    void addOrder() {
        messages.clear();
        assertEquals(customerPayedState.addOrder(), messages);
    }

    @Test
    void cancel() {
        messages.clear();
        assertEquals(customerPayedState.cancel(), messages);
    }

    @Test
    void getOrderStatus() {
        messages.clear();
        assertEquals(customerPayedState.getOrderStatus(), messages);
    }

    @Test
    void getHistory() {
        messages.clear();
        assertEquals(customerPayedState.getHistory(), messages);
    }

    @Test
    void removeOrder() {
        messages.clear();
        assertEquals(customerPayedState.removeOrder(), messages);
    }

    @Test
    void clearResponses() {
        messages.clear();
        assertEquals(customerPayedState.clearResponses(), messages);
    }

    @Test
    void subscribe() {
        messages.clear();
        assertEquals(customerPayedState.subscribe(), messages);
    }

    @Test
    void addReview() {
        messages.clear();
        assertEquals(customerPayedState.addReview(), messages);
    }

    @Test
    void confirmOrder() {
        messages.clear();
        assertEquals(customerPayedState.confirmOrder(), messages);
    }

    @Test
    void payOrder() {
        messages.clear();
        assertEquals(customerPayedState.payOrder(), messages);
    }
}
package com.bot.balgebunbot.service.state.customer;

import com.linecorp.bot.model.message.Message;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CustomerConfirmedOrderTest {

    CustomerConfirmedOrderState customerConfirmedOrderState;
    List<Message> messages;

    @BeforeEach
    void setUp() {
        customerConfirmedOrderState = new CustomerConfirmedOrderState();
        messages = new ArrayList<>();
    }

    @Test
    void register() {
        messages.clear();
        assertEquals(customerConfirmedOrderState.register(), messages);
    }

    @Test
    void help() {
        messages.clear();
        assertEquals(customerConfirmedOrderState.help(), messages);
    }

    @Test
    void addOrder() {
        messages.clear();
        assertEquals(customerConfirmedOrderState.addOrder(), messages);
    }

    @Test
    void cancel() {
        messages.clear();
        assertEquals(customerConfirmedOrderState.cancel(), messages);
    }

    @Test
    void getOrder() {
        messages.clear();
        assertEquals(customerConfirmedOrderState.getOrderStatus(), messages);
    }

    @Test
    void removeOrder() {
        messages.clear();
        assertEquals(customerConfirmedOrderState.removeOrder(), messages);
    }

    @Test
    void clearResponses() {
        messages.clear();
        assertEquals(customerConfirmedOrderState.clearResponses(), messages);
    }

    @Test
    void getHistory() {
        messages.clear();
        assertEquals(customerConfirmedOrderState.getHistory(), messages);
    }

    @Test
    void subscribe(){
        messages.clear();
        assertEquals(customerConfirmedOrderState.subscribe(), messages);
    }

    @Test
    void addReview(){
        messages.clear();
        assertEquals(customerConfirmedOrderState.addReview(), messages);
    }

    @Test
    void confirmOrder(){
        messages.clear();
        assertEquals(customerConfirmedOrderState.confirmOrder(), messages);
    }

    @Test
    void payOrder(){
        messages.clear();
        assertEquals(customerConfirmedOrderState.payOrder(), messages);
    }
}
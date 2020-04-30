package com.bot.balgebunbot.service.state.customer;

import com.linecorp.bot.model.message.Message;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CustomerOrderingStateTest {

    CustomerOrderingState customerOrderingState;
    List<Message> messages;

    @BeforeEach
    void setUp() {
        customerOrderingState = new CustomerOrderingState();
        messages = new ArrayList<>();
    }

    @Test
    void register() {
        messages.clear();
        assertEquals(customerOrderingState.register(), messages);
    }

    @Test
    void help() {
        messages.clear();
        assertEquals(customerOrderingState.help(), messages);
    }

    @Test
    void addOrder() {
        messages.clear();
        assertEquals(customerOrderingState.addOrder(), messages);
    }

    @Test
    void cancel() {
        messages.clear();
        assertEquals(customerOrderingState.cancel(), messages);
    }

    @Test
    void getOrder() {
        messages.clear();
        assertEquals(customerOrderingState.getOrderStatus(), messages);
    }

    @Test
    void removeOrder() {
        messages.clear();
        assertEquals(customerOrderingState.removeOrder(), messages);
    }

    @Test
    void getHistory() {
        messages.clear();
        assertEquals(customerOrderingState.getHistory(), messages);
    }

    @Test
    void clearResponses() {
        messages.clear();
        assertEquals(customerOrderingState.clearResponses(), messages);
    }

    @Test
    void subscribe(){
        messages.clear();
        assertEquals(customerOrderingState.subscribe(), messages);
    }

    @Test
    void addReview(){
        messages.clear();
        assertEquals(customerOrderingState.addReview(), messages);
    }

    @Test
    void confirmOrder(){
        messages.clear();
        assertEquals(customerOrderingState.confirmOrder(), messages);
    }

    @Test
    void payOrder(){
        messages.clear();
        assertEquals(customerOrderingState.payOrder(), messages);
    }
}
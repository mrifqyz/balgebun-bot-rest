package com.bot.balgebunbot.service.state.customer;

import com.bot.balgebunbot.service.state.Messages;
import com.linecorp.bot.model.message.Message;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CustomerUnregisteredStateTest {

    CustomerUnregisteredState customerUnregisteredState;
    List<Message> messages;

    @BeforeEach
    void setUp() {
        customerUnregisteredState = new CustomerUnregisteredState();
        messages = new ArrayList<>();
    }

    @Test
    void register() {
        messages.clear();
        assertEquals(customerUnregisteredState.register(), messages);
    }

    @Test
    void help() {
        messages.clear();
        messages.add(Messages.HELP);
        assertEquals(customerUnregisteredState.help(), messages);
    }

    @Test
    void addOrder() {
        messages.clear();
        assertEquals(customerUnregisteredState.addOrder(), messages);
    }

    @Test
    void cancel() {
        messages.clear();
        assertEquals(customerUnregisteredState.cancel(), messages);
    }

    @Test
    void getOrder() {
        messages.clear();
        assertEquals(customerUnregisteredState.getOrderStatus(), messages);
    }

    @Test
    void removeOrder() {
        messages.clear();
        assertEquals(customerUnregisteredState.removeOrder(), messages);
    }

    @Test
    void clearResponses() {
        messages.clear();
        assertEquals(customerUnregisteredState.clearResponses(), messages);
    }

    @Test
    void getHistory() {
        messages.clear();
        assertEquals(customerUnregisteredState.getHistory(), messages);
    }

    @Test
    void subscribe(){
        messages.clear();
        assertEquals(customerUnregisteredState.subscribe(), messages);
    }

    @Test
    void addReview(){
        messages.clear();
        assertEquals(customerUnregisteredState.addReview(), messages);
    }

    @Test
    void confirmOrder(){
        messages.clear();
        assertEquals(customerUnregisteredState.confirmOrder(), messages);
    }

    @Test
    void payOrder(){
        messages.clear();
        assertEquals(customerUnregisteredState.payOrder(), messages);
    }
}
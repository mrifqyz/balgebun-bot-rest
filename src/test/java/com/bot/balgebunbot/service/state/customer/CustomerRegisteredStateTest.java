package com.bot.balgebunbot.service.state.customer;

import com.bot.balgebunbot.service.state.Messages;
import com.linecorp.bot.model.message.Message;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CustomerRegisteredStateTest {

    CustomerRegisteredState customerRegisteredState;
    List<Message> messages;

    @BeforeEach
    void setUp() {
        customerRegisteredState =  new CustomerRegisteredState();
        messages =  new ArrayList<>();
    }

    @Test
    void register() {
        messages.clear();
        assertEquals(customerRegisteredState.register(), messages);
    }

    @Test
    void help() {
        messages.clear();
        messages.add(Messages.HELP);
        assertEquals(customerRegisteredState.help(), messages);
    }

    @Test
    void addOrder() {
        messages.clear();
        assertEquals(customerRegisteredState.addOrder(), messages);
    }

    @Test
    void cancel() {
        messages.clear();
        assertEquals(customerRegisteredState.cancel(), messages);
    }

    @Test
    void getOrder() {
        messages.clear();
        assertEquals(customerRegisteredState.getOrderStatus(), messages);
    }

    @Test
    void removeOrder() {
        messages.clear();
        assertEquals(customerRegisteredState.removeOrder(), messages);
    }

    @Test
    void clearResponses() {
        messages.clear();
        assertEquals(customerRegisteredState.clearResponses(), messages);
    }

    @Test
    void getHistory() {
        messages.clear();
        assertEquals(customerRegisteredState.getHistory(), messages);
    }

    @Test
    void subscribe(){
        messages.clear();
        assertEquals(customerRegisteredState.subscribe(), messages);
    }

    @Test
    void addReview(){
        messages.clear();
        assertEquals(customerRegisteredState.addReview(), messages);
    }

    @Test
    void confirmOrder(){
        messages.clear();
        assertEquals(customerRegisteredState.confirmOrder(), messages);
    }

    @Test
    void payOrder(){
        messages.clear();
        assertEquals(customerRegisteredState.payOrder(), messages);
    }
}
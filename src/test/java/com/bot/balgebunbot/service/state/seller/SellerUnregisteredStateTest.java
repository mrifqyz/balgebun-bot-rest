package com.bot.balgebunbot.service.state.seller;

import com.linecorp.bot.model.message.Message;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SellerUnregisteredStateTest {

    SellerUnregisteredState sellerUnregisteredState;
    List<Message> messages;

    @BeforeEach
    void setUp() {
        sellerUnregisteredState = new SellerUnregisteredState();
        messages = new ArrayList<>();
    }

    @Test
    void register() {
        messages.clear();
        assertEquals(sellerUnregisteredState.register(), messages);
    }

    @Test
    void help() {
        messages.clear();
        assertEquals(sellerUnregisteredState.help(), messages);
    }

    @Test
    void cancel() {
        messages.clear();
        assertEquals(sellerUnregisteredState.cancel(), messages);
    }

    @Test
    void getOrders() {
        messages.clear();
        assertEquals(sellerUnregisteredState.getOrders(), messages);
    }

    @Test
    void addMenu() {
        messages.clear();
        assertEquals(sellerUnregisteredState.addMenu(), messages);
    }

    @Test
    void removeMenu() {
        messages.clear();
        assertEquals(sellerUnregisteredState.removeMenu(), messages);
    }

    @Test
    void clearResponses() {
        messages.clear();
        assertEquals(sellerUnregisteredState.clearResponses(), messages);
    }

    @Test
    void addPromo(){
        messages.clear();
        assertEquals(sellerUnregisteredState.addPromo(), messages);
    }

    @Test
    void removePromo(){
        messages.clear();
        assertEquals(sellerUnregisteredState.removePromo(), messages);
    }

    @Test
    void getReview(){
        messages.clear();
        assertEquals(sellerUnregisteredState.getReview(), messages);
    }

    @Test
    void notifyOrderDone(){
        messages.clear();
        assertEquals(sellerUnregisteredState.notifyOrderDone(), messages);
    }

    @Test
    void cookOrder(){
        messages.clear();
        assertEquals(sellerUnregisteredState.cookOrder(), messages);
    }

    @Test
    void getHistory(){
        messages.clear();
        assertEquals(sellerUnregisteredState.getHistory(), messages);
    }
}
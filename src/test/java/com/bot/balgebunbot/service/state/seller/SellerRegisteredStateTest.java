package com.bot.balgebunbot.service.state.seller;

import com.bot.balgebunbot.service.state.Messages;
import com.linecorp.bot.model.message.Message;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SellerRegisteredStateTest {

    SellerRegisteredState sellerRegisteredState;
    List<Message> messages;

    @BeforeEach
    void setUp(){
        this.sellerRegisteredState = new SellerRegisteredState();
        this.messages = new ArrayList<>();
    }

    @Test
    void register() {
        messages.clear();
        assertEquals(sellerRegisteredState.register(), messages);
    }

    @Test
    void help() {
        messages.clear();
        messages.add(Messages.HELP);
        assertEquals(sellerRegisteredState.help(), messages);
    }

    @Test
    void cancel() {
        messages.clear();
        assertEquals(sellerRegisteredState.cancel(), messages);
    }

    @Test
    void getOrders() {
        messages.clear();
        assertEquals(sellerRegisteredState.getOrders(), messages);
    }

    @Test
    void addMenu() {
        messages.clear();
        assertEquals(sellerRegisteredState.addMenu(), messages);
    }

    @Test
    void removeMenu() {
        messages.clear();
        assertEquals(sellerRegisteredState.removeMenu(), messages);
    }

    @Test
    void clearResponses() {
        messages.clear();
        assertEquals(sellerRegisteredState.clearResponses(), messages);
    }

    @Test
    void addPromo(){
        messages.clear();
        assertEquals(sellerRegisteredState.addPromo(), messages);
    }

    @Test
    void removePromo(){
        messages.clear();
        assertEquals(sellerRegisteredState.removePromo(), messages);
    }

    @Test
    void getReview(){
        messages.clear();
        assertEquals(sellerRegisteredState.getReview(), messages);
    }

    @Test
    void notifyOrderDone(){
        messages.clear();
        assertEquals(sellerRegisteredState.notifyOrderDone(), messages);
    }

    @Test
    void cookOrder(){
        messages.clear();
        assertEquals(sellerRegisteredState.cookOrder(), messages);
    }
    @Test
    void getHistory(){
        messages.clear();
        assertEquals(sellerRegisteredState.getHistory(), messages);
    }
}
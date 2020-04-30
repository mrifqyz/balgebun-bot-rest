package com.bot.balgebunbot.service.state.seller;

import com.linecorp.bot.model.message.Message;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SellerAcceptingOrderStateTest {

    SellerAcceptingOrderState sellerAcceptingOrderState;
    List<Message> messages;

    @BeforeEach

    void setUp(){
        sellerAcceptingOrderState = new SellerAcceptingOrderState();
        messages = new ArrayList<>();
    }

    @Test
    void register() {
        messages.clear();
        assertEquals(sellerAcceptingOrderState.register(), messages);
    }

    @Test
    void help() {
        messages.clear();
        assertEquals(sellerAcceptingOrderState.help(), messages);
    }

    @Test
    void cancel() {
        messages.clear();
        assertEquals(sellerAcceptingOrderState.cancel(), messages);
    }

    @Test
    void getOrders() {
        messages.clear();
        assertEquals(sellerAcceptingOrderState.getOrders(), messages);
    }

    @Test
    void addMenu() {
        messages.clear();
        assertEquals(sellerAcceptingOrderState.addMenu(), messages);
    }

    @Test
    void removeMenu() {
        messages.clear();
        assertEquals(sellerAcceptingOrderState.removeMenu(), messages);
    }

    @Test
    void clearResponses() {
        messages.clear();
        assertEquals(sellerAcceptingOrderState.clearResponses(), messages);
    }

    @Test
    void addPromo(){
        messages.clear();
        assertEquals(sellerAcceptingOrderState.addPromo(), messages);
    }

    @Test
    void removePromo(){
        messages.clear();
        assertEquals(sellerAcceptingOrderState.removePromo(), messages);
    }

    @Test
    void getReview(){
        messages.clear();
        assertEquals(sellerAcceptingOrderState.getReview(), messages);
    }

    @Test
    void notifyOrderDone(){
        messages.clear();
        assertEquals(sellerAcceptingOrderState.notifyOrderDone(), messages);
    }

    @Test
    void cookOrder(){
        messages.clear();
        assertEquals(sellerAcceptingOrderState.cookOrder(), messages);
    }

    @Test
    void getHistory(){
        messages.clear();
        assertEquals(sellerAcceptingOrderState.getHistory(), messages);
    }
}
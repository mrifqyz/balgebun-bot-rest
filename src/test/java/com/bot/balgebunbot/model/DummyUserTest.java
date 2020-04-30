package com.bot.balgebunbot.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DummyUserTest {

    DummyUser dummyUser;

    @BeforeEach
    void setUp() {
        this.dummyUser = new DummyUser("dummy");
    }

    @Test
    void getName() {
        assertEquals("dummy", dummyUser.getName());
    }

    @Test
    void getState() {
        assertEquals("CUSTOMER REGISTERED", dummyUser.getState());
    }
}
package com.bot.balgebunbot.model;

import com.bot.balgebunbot.service.state.customer.CustomerRegisteredState;

public class DummyUser {

    private String name;
    private String state;

    public DummyUser(String name){
        this.name = name;
        this.state = CustomerRegisteredState.DB_COL_NAME;
    }

    public String getName(){
        return this.name;
    }

    public String getState() {
        return this.state;
    }
}

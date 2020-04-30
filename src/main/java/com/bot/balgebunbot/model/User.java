package com.bot.balgebunbot.model;

import javax.persistence.*;

@MappedSuperclass
public abstract class User {
    @Id
    @Column(name = "username",  nullable = false, unique = true)
    protected String username;

    @Column(name = "name")
    protected String name;

    @Column(name = "phone_number")
    protected String phoneNumber;

    @Column(name = "state")
    protected String state;

    public String getUsername() {
        return username;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}

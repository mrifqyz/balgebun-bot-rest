package com.bot.balgebunbot.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "customer")
@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "username")
public class Customer extends User implements Serializable {
    @ManyToMany(mappedBy = "customers",
            cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Set<Seller> sellers = new HashSet<>();

    public Customer(){

    }

    public Customer(String username, String name, String phoneNumber){
        this.username = username;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.state = "dummy state";
    }

    public Set<Seller> getSellers() {
        return sellers;
    }

    public void setSellers(Set<Seller> sellers) {
        this.sellers = sellers;
    }

}

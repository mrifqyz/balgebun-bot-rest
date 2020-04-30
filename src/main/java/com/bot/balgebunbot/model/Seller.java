package com.bot.balgebunbot.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "seller")
@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "username")
public class Seller extends User implements Serializable {
    @Column(name = "counter_id", unique = true, nullable = false, updatable = false)
    private String counterID;

    @Column(name = "gopay_number")
    private String gopayNumber;

    @ManyToMany(cascade =
            {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(name = "seller_customer",
            joinColumns = {
                    @JoinColumn(
                            name = "seller_id",
                            referencedColumnName = "username"
                    )
            },
            inverseJoinColumns = {
                    @JoinColumn(
                            name = "customer_id",
                            referencedColumnName = "username"
                    )
            }
    )
    private Set<Customer> customers = new HashSet<>();

    @OneToMany(mappedBy = "seller",
            cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Set<Purchase> purchasesSeller = new HashSet<>();

    public Seller(){

    }

    public Seller(String username, String name, String phoneNumber, String counterID, String gopayNumber){
        this.username = username;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.state = "dummy state";
        this.counterID = counterID;
        this.gopayNumber = gopayNumber;
    }

    public Set<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(Set<Customer> customers) {
        this.customers = customers;
    }

    public String getGopayNumber() {
        return gopayNumber;
    }
    public String getCounterID() {
        return counterID;
    }
    public void setCounterID(String counterID) {
        this.counterID = counterID;
    }
    public void setGopayNumber(String gopayNumber) {
        this.gopayNumber = gopayNumber;
    }

    public void setPurchasesSeller(Set<Purchase> purchasesSeller) {
        this.purchasesSeller = purchasesSeller;
    }

    public Set<Purchase> getPurchasesSeller() {
        return purchasesSeller;
    }
}

package com.bot.balgebunbot.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "purchase")
public class Purchase {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "purchase_id", updatable = false, nullable = false)
    private long purchaseID;

    @Column(name = "total_price")
    private long totalPrice;

    @Column(name = "notes")
    private String notes;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(referencedColumnName = "username", nullable = false)
    private Seller seller;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(referencedColumnName = "username", nullable = false)
    private Customer customer;

    @ManyToMany(cascade =
            {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(name = "item_purchased",
            joinColumns = {
                    @JoinColumn(
                            name = "purchase_id_2",
                            referencedColumnName = "purchase_id"
                    )
            },
            inverseJoinColumns = {
                    @JoinColumn(
                            name = "item_id_2",
                            referencedColumnName = "item_id"
                    )
            }
    )
    private Set<Item> itemBought = new HashSet<>();

    public Purchase(){}

    public Purchase(Seller seller, Customer customer, Set<Item> itemBought, String notes){
        this.seller = seller;
        this.customer = customer;
        this.itemBought = itemBought;
        this.totalPrice = 0;
        this.notes = notes;
        for(Item item: itemBought){
            this.totalPrice += item.getPrice();
        }
    }

    public Seller getSeller(){return this.seller;}

    public long getTotalPrice() {
        return totalPrice;
    }

    public Customer getCustomer() {
        return customer;
    }

    public long getPurchaseID() {
        return purchaseID;
    }

    public void setPurchaseID(long purchaseID) {
        this.purchaseID = purchaseID;
    }

    public Set<Item> getItemBought() {
        return itemBought;
    }

    public String getNotes() {
        return notes;
    }

    public void setSeller(Seller seller){
        this.seller = seller;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setItemBought(Set<Item> itemBought) {
        this.itemBought = itemBought;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public void setTotalPrice(long totalPrice) {
        this.totalPrice = totalPrice;
    }
}

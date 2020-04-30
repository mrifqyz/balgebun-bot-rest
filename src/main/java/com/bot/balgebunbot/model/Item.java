package com.bot.balgebunbot.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "item")
public class Item implements Serializable {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "item_num", updatable = false, nullable = false)
    private long itemNum;

    @Id
    @Column(name = "item_id", updatable = false, nullable = false)
    private String itemID;

    @Column(name = "item_name")
    private String itemName;

    @Column(name = "price")
    private long price;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(referencedColumnName = "counter_id", nullable = false)
    private Seller seller;

    @ManyToMany(mappedBy = "itemBought",
            cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Set<Purchase> purchaseWithThisItem = new HashSet<>();

    public Item(){

    }

    public Item(long itemNum, String itemID, String itemName, long price, Seller seller){
        this.itemNum = itemNum;
        this.itemName = itemName;
        this.price = price;
        this.seller = seller;
        this.itemID = itemID;
    }

    public long getItemNum() {
        return itemNum;
    }

    public String getItemID() {
        return itemID;
    }

    public String getItemName() {
        return itemName;
    }

    public Seller getSeller() {
        return seller;
    }

    public long getPrice() {
        return price;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setItemID(String itemID) {
        this.itemID = itemID;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public void setItemNum(long itemNum) {
        this.itemNum = itemNum;
    }
}

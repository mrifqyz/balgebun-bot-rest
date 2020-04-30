package com.bot.balgebunbot.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "review")
public class Review implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "review_id", updatable = false, nullable = false)
    private String reviewID;

    @Column(name = "review_description")
    private String reviewDescription;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(referencedColumnName = "item_id", nullable = false)
    private Item item;

    public Review(){

    }

    public Review(String reviewID, String reviewDescription, Item item){
        this.reviewID = reviewID;
        this.reviewDescription = reviewDescription;
        this.item = item;
    }

    public Item getItem() {
        return item;
    }

    public String getReviewDescription() {
        return reviewDescription;
    }

    public String getReviewID() {
        return reviewID;
    }

    public void setReviewID(String reviewID) {
        this.reviewID = reviewID;
    }

    public void setReviewDescription(String reviewDescription) {
        this.reviewDescription = reviewDescription;
    }

    public void setItem(Item item) {
        this.item = item;
    }
}

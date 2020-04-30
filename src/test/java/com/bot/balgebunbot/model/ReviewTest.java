package com.bot.balgebunbot.model;

import com.bot.balgebunbot.model.Item;
import com.bot.balgebunbot.model.Review;
import com.bot.balgebunbot.model.Seller;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class ReviewTest {
    Review review;
    Review reviewNullConstructor;
    Item item;
    Seller seller;

    @BeforeEach
    public void setUp(){
        seller = new Seller("mrifqyz17", "cinoy", "087777535288",
                "CNY", "087777535288");
        item = new Item(1, "NGP", "Nasi Goreng Pedas", 12000, seller);
        review = new Review("R01", "Jelek", item);
        reviewNullConstructor = new Review();
    }

    @Test
    public void testGetterMethod(){
        assertEquals(review.getReviewID(), "R01");
        assertEquals(review.getReviewDescription(), "Jelek");
        assertEquals(review.getItem(), item);
        assertNull(reviewNullConstructor.getItem());
    }

    @Test
    public void testItemSetterMethod(){
        Item itemReplace = new Item(69, "TEA", "NU Green Tea", 6000, seller);
        review.setItem(itemReplace);
        review.setReviewDescription("Keren");
        review.setReviewID("R69");

        assertEquals(review.getReviewID(), "R69");
        assertEquals(review.getReviewDescription(), "Keren");
        assertEquals(review.getItem(), itemReplace);
    }
}

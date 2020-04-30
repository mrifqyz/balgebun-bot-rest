package com.bot.balgebunbot.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class PurchaseTest {

    Seller s1, s2;
    Customer c1, c2;
    Item is11, is12, is21;
    Purchase p1, p2, p3;

    @BeforeEach
    public void setUp(){
        s1 = new Seller("s1", "ns1", "12", "1", "12");
        s2 = new Seller("s2", "ns2", "22", "2", "22");
        c1 = new Customer("c1", "nc1", "11");
        c2 = new Customer("c2", "nc2", "21");
        is11 = new Item(11, "is11", "item1s1", 69, s1);
        is12 = new Item(12, "is12", "item2s1", 70, s1);
        is21 = new Item(21, "is21", "item1s2", 4, s2);
        Set<Item> itemp1 = new HashSet<>();
        itemp1.add(is11);
        p1 = new Purchase(s1, c1, itemp1, "notesp1");
        Set<Item> itemp2 = new HashSet<>();
        itemp2.add(is11);
        itemp2.add(is12);
        p2 = new Purchase(s1, c2, itemp2, "notesp2");
        Set<Item> itemp3 = new HashSet<>();
        itemp3.add(is21);
        p3 = new Purchase(s2, c1, itemp3, "notesp3");
    }

    @Test
    void getSellerReturnsTheRightSeller(){
        assertEquals(s1, p1.getSeller());
        assertEquals(s1, p2.getSeller());
        assertEquals(s2, p3.getSeller());
    }

    @Test
    void totalPriceShouldAddForEveryItem(){
        assertEquals(p1.getTotalPrice(), 69);
        assertEquals(p2.getTotalPrice(), 139);
        assertEquals(p3.getTotalPrice(), 4);
    }

//    @Test
//    void purchaseShouldBeAddedToCustomerPurchaseList(){
//        assertTrue(c1.getPurchaseList().contains(p1));
//        assertTrue(c2.getPurchaseList().contains(p2));
//        assertTrue(c1.getPurchaseList().contains(p3));
//    }
//
//    @Test
//    void purchaseShouldBeAddedToSellerPurchaseList(){
//        assertTrue(s1.getPurchaseList().contains(p1));
//        assertTrue(s1.getPurchaseList().contains(p2));
//        assertTrue(s2.getPurchaseList().contains(p3));
//    }

}

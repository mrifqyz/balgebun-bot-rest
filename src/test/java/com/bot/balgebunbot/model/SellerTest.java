package com.bot.balgebunbot.model;

import com.bot.balgebunbot.model.Customer;
import com.bot.balgebunbot.model.Seller;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class SellerTest {
    Seller seller;
    Seller sellerWithNoArgsConstructor;
    Customer customerDummy;

    @BeforeEach
    public void setUp(){
        seller = new Seller("mrifqyz17", "cinoy", "087777535288",
                "CNY", "087777535288");
        sellerWithNoArgsConstructor = new Seller();
        customerDummy = new Customer("subur", "arya wiguna", "14045170700");
    }

    @Test
    public void testGetterMethod(){
        assertEquals(seller.getName(), "cinoy");
        assertEquals(seller.getPhoneNumber(), "087777535288");
        assertEquals(seller.getUsername(), "mrifqyz17");
        assertEquals(seller.getState(), "dummy state");
        assertEquals(seller.getGopayNumber(), "087777535288");
        assertEquals(seller.getCounterID(), "CNY");
        assertNull(sellerWithNoArgsConstructor.getUsername());
        assertTrue(seller.getCustomers().isEmpty());
    }

    @Test
    public void testSetterMethod(){
        Set<Customer> setDummy = new HashSet<>();
        setDummy.add(customerDummy);
        seller.setName("Cicak bin Kadal");
        seller.setPhoneNumber("180050050517");
        seller.setGopayNumber("180050050517");
        seller.setCounterID("CBK");
        seller.setState("Ordering");
        seller.setUsername("cibikal");
        seller.setCustomers(setDummy);

        assertEquals(seller.getName(), "Cicak bin Kadal");
        assertEquals(seller.getPhoneNumber(), "180050050517");
        assertEquals(seller.getUsername(), "cibikal");
        assertEquals(seller.getState(), "Ordering");
        assertEquals(seller.getGopayNumber(), "180050050517");
        assertEquals(seller.getCounterID(), "CBK");
        assertFalse(seller.getCustomers().isEmpty());
    }
}

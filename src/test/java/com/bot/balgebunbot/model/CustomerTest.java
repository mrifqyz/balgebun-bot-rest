package com.bot.balgebunbot.model;

import com.bot.balgebunbot.model.Customer;
import com.bot.balgebunbot.model.Seller;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class CustomerTest {
    Customer customer;
    Customer customerWithNoArgsConstructor;
    Seller sellerDummy;

    @BeforeEach
    public void setUp(){
        customer = new Customer("mrifqyz17", "cinoy", "087777535288");
        customerWithNoArgsConstructor = new Customer();
        sellerDummy = new Seller("subur", "arya wiguna", "14045170700",
                "SAW", "14045170700");
    }

    @Test
    public void testGetterMethod(){
        Set<Seller> sellersTest = customer.getSellers();
        assertEquals(customer.getName(), "cinoy");
        assertEquals(customer.getPhoneNumber(), "087777535288");
        assertEquals(customer.getUsername(), "mrifqyz17");
        assertEquals(customer.getState(), "dummy state");
        assertNull(customerWithNoArgsConstructor.getUsername());
        assertTrue(sellersTest.isEmpty());
    }

    @Test
    public void testSetterMethod(){
        Set<Seller> setDummy = new HashSet<>();
        setDummy.add(sellerDummy);
        customer.setName("Cicak bin Kadal");
        customer.setPhoneNumber("180050050517");
        customer.setState("Ordering");
        customer.setUsername("cibikal");
        customer.setSellers(setDummy);

        assertEquals(customer.getName(), "Cicak bin Kadal");
        assertEquals(customer.getPhoneNumber(), "180050050517");
        assertEquals(customer.getUsername(), "cibikal");
        assertEquals(customer.getState(), "Ordering");
        assertFalse(customer.getSellers().isEmpty());
    }
}

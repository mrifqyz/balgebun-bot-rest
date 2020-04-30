package com.bot.balgebunbot.model;

import com.bot.balgebunbot.model.Item;
import com.bot.balgebunbot.model.Seller;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class ItemTest {

    Item item;
    Item itemNullConstructor;
    Seller seller;

    @BeforeEach
    public void setUp(){
        seller = new Seller("mrifqyz17", "cinoy", "087777535288",
                "CNY", "087777535288");
        item = new Item(1, "NGP", "Nasi Goreng Pedas", 12000, seller);
        itemNullConstructor = new Item();
    }

    @Test
    public void testGetterMethod(){
        assertEquals(item.getItemNum(), 1);
        assertEquals(item.getItemID(), "NGP");
        assertEquals(item.getItemName(), "Nasi Goreng Pedas");
        assertEquals(item.getPrice(), 12000);
        assertEquals(item.getSeller(), seller);
        assertNull(itemNullConstructor.getSeller());
    }

    @Test
    public void testItemSetterMethod(){
        Seller sellerReplace = new Seller("sugeng", "ganteng", "081315681216",
                "SGG", "081315681216");
        item.setItemID("AGT");
        item.setItemName("Ayam Goreng Tepung");
        item.setItemNum(2);
        item.setPrice(20000);
        item.setSeller(sellerReplace);

        assertEquals(item.getItemNum(), 2);
        assertEquals(item.getSeller(), sellerReplace);
        assertEquals(item.getPrice(), 20000);
        assertEquals(item.getItemName(), "Ayam Goreng Tepung");
        assertEquals(item.getItemID(), "AGT");

    }

}

package com.bot.balgebunbot.repository;

import com.bot.balgebunbot.model.Purchase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PurchaseRepository extends JpaRepository<Purchase, String>  {

    @Query(value = "SELECT * FROM purchase p where p.customer_username = ?1", nativeQuery = true)
    List<Purchase> findAllPurchaseByCustomerID (String customerID);

    @Query(value = "SELECT * FROM purchase p where p.seller_username = ?1", nativeQuery = true)
    List<Purchase> findAllPurchaseBySellerID (String sellerID);
}

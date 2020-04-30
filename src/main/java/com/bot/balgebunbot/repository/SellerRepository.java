package com.bot.balgebunbot.repository;

import com.bot.balgebunbot.model.Seller;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface SellerRepository extends JpaRepository<Seller, String>  {
    void deleteById(String id);

    Optional<Seller> findById(String id);
}

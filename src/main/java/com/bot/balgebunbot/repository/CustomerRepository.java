package com.bot.balgebunbot.repository;

import com.bot.balgebunbot.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface CustomerRepository extends JpaRepository<Customer, String> {
    Optional<Customer> findById(String id);

}

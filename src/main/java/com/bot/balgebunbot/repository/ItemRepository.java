package com.bot.balgebunbot.repository;

import com.bot.balgebunbot.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;
public interface ItemRepository extends JpaRepository<Item, String> {
}

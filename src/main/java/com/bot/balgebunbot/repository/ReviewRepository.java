package com.bot.balgebunbot.repository;

import com.bot.balgebunbot.model.Review;
import org.springframework.data.jpa.repository.JpaRepository;
public interface ReviewRepository extends JpaRepository<Review, String> {
}

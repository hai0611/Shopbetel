package com.shop.shopbetel.repository;

import com.shop.shopbetel.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}

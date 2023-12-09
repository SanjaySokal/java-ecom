package com.company.manager.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.company.manager.Entity.Cart;

public interface CartRepo extends JpaRepository<Cart, Long> {
}

package com.company.manager.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.company.manager.Entity.Orders;

public interface OrderRepo extends JpaRepository<Orders, Long> {
}

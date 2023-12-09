package com.company.manager.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.company.manager.Entity.Products;

public interface ProductRepo extends JpaRepository<Products, Long> {
}

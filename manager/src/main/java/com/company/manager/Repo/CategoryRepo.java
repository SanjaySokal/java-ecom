package com.company.manager.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.company.manager.Entity.Catagories;

public interface CategoryRepo extends JpaRepository<Catagories, Long> {
}

package com.company.manager.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.company.manager.Entity.User;

public interface UserRepo extends JpaRepository<User, Long> {
}

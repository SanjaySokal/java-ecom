package com.company.manager.Service;

import java.util.List;

import com.company.manager.Entity.User;

public interface UserService {
    public List<User> getAllUsers();

    public User getUser(Long id);

    public User loginUser(User user);

    public boolean addUser(User user);

    public boolean deleteUser(Long id);
}

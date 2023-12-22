package com.company.manager.ServiceImplement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.manager.Entity.User;
import com.company.manager.Repo.UserRepo;
import com.company.manager.Service.UserService;

@Service
public class UserImpl implements UserService {
    @Autowired
    private UserRepo repo;

    @Override
    public List<User> getAllUsers() {
        return repo.findAll();
    }

    @Override
    public User getUser(Long id) {
        return repo.findById(id).get();
    }

    @Override
    public boolean addUser(User user) {
        repo.save(user);
        return true;
    }

    @Override
    public boolean deleteUser(Long id) {
        if (repo.existsById(id)) {
            repo.deleteById(id);
            return true;
        }
        return false;
    }

    @Override
    public User loginUser(User user) {
        User user2 = repo.findByEmail(user.getEmail());
        return user2;
        // if (user.getPassword() == user2.getPassword()) {
        // return true;
        // }
        // return false;
    }
}

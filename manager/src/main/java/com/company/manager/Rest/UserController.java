package com.company.manager.Rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.company.manager.Entity.User;
import com.company.manager.Service.UserService;

@RestController
public class UserController {
    @Autowired
    private UserService service;

    @GetMapping("/")
    private String hello() {
        return "Hello";
    }

    @GetMapping("/all-users")
    private List<User> allUsers() {
        return service.getAllUsers();
    }

    @PostMapping("/login")
    private User login(@RequestBody User user) {
        return service.loginUser(user);
    }
}

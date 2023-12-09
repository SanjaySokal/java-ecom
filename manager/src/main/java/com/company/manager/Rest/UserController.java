package com.company.manager.Rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.company.manager.Service.UserService;

@RestController
public class UserController {
    @Autowired
    private UserService service;
}

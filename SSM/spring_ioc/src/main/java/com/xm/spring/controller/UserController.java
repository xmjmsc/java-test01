package com.xm.spring.controller;

import com.xm.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller("controller")
public class UserController {

    @Autowired
    private UserService userService;

    public void saveUser() {
        userService.savaUser();
    }
}

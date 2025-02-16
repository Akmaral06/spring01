package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AppRunner {
    private final UserService userService;

    @Autowired
    public AppRunner(UserService userService) {
        this.userService = userService;
    }

    public void run() {
        System.out.println(userService.getUserById(10));
    }
}

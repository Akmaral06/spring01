package com.example;

import org.springframework.stereotype.Component;

@Component
public class UserService {
    public String getUserById(int id) {
        return "User ID: " + id;
    }
}

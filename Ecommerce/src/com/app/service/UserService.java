package com.app.service;

import java.util.ArrayList;
import java.util.List;

import com.app.model.User;

public class UserService {
    private List<User> users = new ArrayList<>();

    public void addUser(User user) {
        users.add(user);
        System.out.println("User added: " + user.getName());
    }

    public List<User> getAllUsers() {
        return users;
    }
}

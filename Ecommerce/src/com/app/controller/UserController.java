package com.app.controller;

import com.app.model.User;
import com.app.service.UserService;

public class UserController {
    private UserService userService = new UserService();

    public void addUser(int id, String name, String email) {
        userService.addUser(new User(id, name, email));
    }

    public void displayUsers() {
        userService.getAllUsers().forEach(user ->
                System.out.println("User ID: " + user.getId() +
                                   ", Name: " + user.getName() +
                                   ", Email: " + user.getEmail()));
        System.out.println("lines added by XYz");
    }
}

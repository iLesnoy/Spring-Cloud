package com.dev.petrovskiy.controller;

import com.dev.petrovskiy.repository.model.User;
import com.dev.petrovskiy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<User> findAllUsers(){
        return userService.findAllUsers();
    }

    @PostMapping("/add/user")
    public User createUser(@RequestBody User user){
        return userService.createUser(user);
    }
}

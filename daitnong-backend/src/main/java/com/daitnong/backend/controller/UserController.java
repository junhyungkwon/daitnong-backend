package com.daitnong.backend.controller;

import com.daitnong.backend.entity.User;
import com.daitnong.backend.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/create")
    public User createUser(@RequestBody User user) {
        return userService.save(user);
    }

    @PostMapping("/list")
    public List<User> getUsers() {
        return userService.findAll();
    }
}
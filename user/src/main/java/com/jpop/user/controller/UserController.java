package com.jpop.user.controller;

import com.jpop.user.entity.User;
import com.jpop.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user/v1/users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("")
    public ResponseEntity<List<User>> getAllUsers() {
        return ResponseEntity.ok(userService.getAllUsers());
    }

    @PostMapping("")
    public ResponseEntity<User> saveUser(@RequestBody User user) {
        return ResponseEntity.ok(userService.saveUser(user));
    }
    @GetMapping("/{user_id}")
    public ResponseEntity<User> getUserbyID(@PathVariable(name = "user_id") Integer id) {
        return ResponseEntity.ok(userService.getUserByID(id));
    }
    @DeleteMapping("/{user_id}")
    public ResponseEntity<User> deleteUserByID(@PathVariable(name = "user_id") Integer id) {
        return ResponseEntity.ok(userService.deleteUserByID(id));
    }

    @PutMapping("/")
    public ResponseEntity<User> updateUserByID(@RequestBody User user) {
        return ResponseEntity.ok(userService.updateUser(user));
    }
}

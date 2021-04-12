package com.mypractice.liquibase.controller;

import com.mypractice.liquibase.domain.User;
import com.mypractice.liquibase.repo.UserRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserRepository userRepository;
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    @PostMapping
    public User addUser(@RequestBody User user) {
        return userRepository.save(user);
    }
    @GetMapping("/{id}")
    public ResponseEntity<User> getUser(@PathVariable("id") Long userId) {
        return ResponseEntity.of(Optional.ofNullable(userRepository.findById(userId).orElseThrow(()->new RuntimeException("record not found"))));
    }
}

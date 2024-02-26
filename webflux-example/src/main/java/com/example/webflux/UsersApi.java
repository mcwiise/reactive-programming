package com.example.webflux;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class UsersApi {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/users/{userId}")
    public Mono<User> getUsersById(@PathVariable String userId){
        return userService.getUserById(userId);
    }

    @GetMapping(value = "/users")
    public Flux<User> getUsers(){
        return userService.getAllUsers();
    }
}

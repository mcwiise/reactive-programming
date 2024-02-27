package com.example.webflux;

import com.sun.source.tree.BinaryTree;
import org.javatuples.Pair;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

@Service
public class UserService {

    @Autowired
    private UsersRepository repository;

    public Mono<User> getUserById(String userId) {
        return repository
                .findById(Integer.valueOf(userId))
                .map(this::fromRecord);
    }

    public Flux<User> getAllUsers(){
        return repository
                .findAll()
                .map(this::fromRecord);
    }

    private User fromRecord(UserRecord userRecord){
        var user = new User();
        user.setName(userRecord.getName());
        user.setLastName(userRecord.getLastName());
        return user;
    }
}

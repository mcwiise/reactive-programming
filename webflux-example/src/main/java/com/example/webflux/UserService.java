package com.example.webflux;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

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

package com.example.webflux;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
public interface UsersRepository extends ReactiveCrudRepository<UserRecord, Integer> {
}

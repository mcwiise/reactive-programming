package com.netty.example;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class NoBlockingApi {

    @GetMapping(value = "/no-blocking")
    public Mono<ResponseEntity<String>> noBlocking(){
        return Mono.just(ResponseEntity.ok("done"));
    }

    private static void sleep(){
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

package com.netty.example;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;
import reactor.core.scheduler.Scheduler;
import reactor.core.scheduler.Schedulers;

@RestController
public class NoBlockingApi {

    @GetMapping(value = "/no-blocking")
    public Mono<ResponseEntity<String>> noBlocking(){
        return Mono.just(ResponseEntity.ok("done")).subscribeOn(Schedulers.boundedElastic());
    }

    private static void sleep(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

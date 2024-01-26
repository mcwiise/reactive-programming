package com.tomcat.example;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BlockingApi {

    @GetMapping(value = "/blocking")
    public ResponseEntity<String> blocking(){
        return ResponseEntity.ok("done");
    }

    private static void sleep(){
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

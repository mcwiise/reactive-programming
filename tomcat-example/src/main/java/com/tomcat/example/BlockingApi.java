package com.tomcat.example;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class BlockingApi {

    @GetMapping(value = "/blocking")
    public ResponseEntity<String> blocking(){
        return ResponseEntity.ok("done");
    }

}

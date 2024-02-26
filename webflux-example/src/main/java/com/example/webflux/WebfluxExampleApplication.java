package com.example.webflux;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories;

@SpringBootApplication
public class WebfluxExampleApplication {
    public static void main(String[] args) {
        SpringApplication.run(WebfluxExampleApplication.class, args);
    }

}

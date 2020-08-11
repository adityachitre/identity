package com.adichi.identity.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.ResponseEntity.ok;

@RestController
public class HelloWorldController {

    @GetMapping("/hello")
    public ResponseEntity<String> helloWorld() {

        return ok("Hello World");
    }
}

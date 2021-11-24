package dev.infra.jenkinstdois.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @GetMapping
    public ResponseEntity<String> hello(){
        return ResponseEntity.ok().body("Hello World!");
    }
}

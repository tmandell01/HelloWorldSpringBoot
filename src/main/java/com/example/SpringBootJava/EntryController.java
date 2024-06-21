package com.example.SpringBootJava;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping
public class EntryController {

    @GetMapping("/home")
    public String hello() {
        return "Hello, World";
    }

    @GetMapping("/new")
    public String New() {
        return "new";
    }
    
}

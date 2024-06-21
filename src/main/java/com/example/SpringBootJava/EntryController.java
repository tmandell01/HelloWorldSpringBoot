package com.example.SpringBootJava;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/api/v1/tasks")
public class EntryController {

    @GetMapping("/home")
    public String hello() {
        return "Hello, World";
    }
    
}

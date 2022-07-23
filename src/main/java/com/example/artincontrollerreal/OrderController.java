package com.example.artincontrollerreal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.PublicKey;

@RestController
@RequestMapping("/Order")
public class OrderController {
    @GetMapping
    public String sayHello()
    {
        return "Hello";
    }
}

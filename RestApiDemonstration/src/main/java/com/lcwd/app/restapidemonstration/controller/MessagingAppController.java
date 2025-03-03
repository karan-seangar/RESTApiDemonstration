package com.lcwd.app.restapidemonstration.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessagingAppController {
    @GetMapping("/hello")
    public String hello() {
        return "Hello from BridgeLabz!";
    }

    @GetMapping("/hello/query")
    public String hello(@RequestParam String name) {
        return "Hello " + name + " from BridgeLabz!";
    }

    @GetMapping("/hello/param/{name}")
    public String helloParam(@PathVariable String name) {
        return "Hello " + name + " from BridgeLabz!";
    }
}

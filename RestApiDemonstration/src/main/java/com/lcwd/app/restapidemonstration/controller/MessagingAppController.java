package com.lcwd.app.restapidemonstration.controller;

import com.lcwd.app.restapidemonstration.dto.UserDTO;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/hello/post")
    public String hello(@RequestBody UserDTO user) {
        return "Hello " + user.getFirstName() + " " + user.getLastName() + " from BridgeLabz!";
    }

    @PutMapping("/hello/put/{firstName}")
    public String helloPut(@PathVariable String firstName, @RequestParam(name = "lastName") String lastName) {
        return "Hello " + firstName + " " + lastName + " from BridgeLabz!";
    }
}

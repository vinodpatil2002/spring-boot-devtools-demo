package com.javacodes.springbootdemo.firstSpringApp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class funRestController {
    // expose a "/" endpoint that return "Hello world"

    @GetMapping("/")
    public String sayHello() {
        return "Hello world";
    }

    // expose a new endpoint for workout

    @GetMapping("/workout")
    public String getDailyWorkout(){
        return  "Run a hard 5K";
    }

}

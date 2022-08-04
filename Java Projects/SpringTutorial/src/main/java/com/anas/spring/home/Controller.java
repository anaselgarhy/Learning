package com.anas.spring.home;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @RequestMapping("/") // or @RequestMapping(value = "/")
    public String getHome() {
        return "Hello World!";
    }

    @GetMapping(value = "/{name}") // or @RequestMapping(value = "/{name}")
    public String greetWithName(@PathVariable final String name) {
        return "Hello " + name + "!";
    }
}

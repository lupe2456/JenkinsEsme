package com.example.jenkins_ci;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloController {

    @GetMapping
    public String hello(){
        return "Hello World";
    }

    @PostMapping
    public String hello2(){
        return "Hello World 2";
    }

}

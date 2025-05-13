package com.example.jenkins_ci;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloController {

    @GetMapping("/hello1")
    public String hello(){
        return "Hello World";
    }

    @PostMapping("/hello2")
    public String hello2(){
        return "Hello World 2 :)";
    }

    @PostMapping("/hello3")
    public String hello3(){
        return "Hello World 3 :)";
    }
}

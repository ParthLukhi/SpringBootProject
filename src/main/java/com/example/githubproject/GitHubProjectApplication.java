package com.example.githubproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GitHubProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(GitHubProjectApplication.class, args);
    }

    @GetMapping("/ping")
    public String ping(){
        return "pong";
    }

}

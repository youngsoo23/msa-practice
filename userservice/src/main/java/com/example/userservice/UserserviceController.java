package com.example.userservice;

import lombok.RequiredArgsConstructor;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/")
@RestController
@RequiredArgsConstructor
public class UserserviceController {

    private final Environment env;

    @GetMapping("/health_check")
    public String status(){
        return String.format("It's working : " + env.getProperty("server.port")
        +", port(server.port): " + env.getProperty("token.expiration_time"));
    }
}

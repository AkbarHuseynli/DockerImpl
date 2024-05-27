package com.example;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("v1/api")
@AllArgsConstructor
public class Controller {

    private final IUserRepository userRepository;


    @GetMapping
    public List<User> returnUsers(){
       return userRepository.findAll();
    }

}

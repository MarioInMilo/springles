package com.example.demo;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Cont {

    @Autowired
    private UserService service;
    @GetMapping("/get")
    public void test(){
        User user = new User(1, "wer", 343.3);
        service.save(user);
    }
}

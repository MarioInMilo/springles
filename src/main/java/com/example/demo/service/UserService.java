package com.example.demo.service;

import com.example.demo.model.User;

public interface UserService {
    void save(User user);

    Double salaryInDollars(Double BYN);
    Double salaryInEURO(Double BYN);
}



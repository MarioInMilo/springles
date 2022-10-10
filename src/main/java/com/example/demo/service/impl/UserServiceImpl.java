package com.example.demo.service.impl;

import com.example.demo.model.User;
import com.example.demo.service.SalaryService;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private SalaryService salaryService;

    @Override
    public void save(User user) {
        System.out.println("In currency: " + salaryInDollars(user.getSalary()));
        System.out.println("In currency: " + salaryInEURO(user.getSalary()));
        System.out.printf("Success: " + user);
    }

    @Override
    public Double salaryInDollars(Double BYN) {
        return salaryService.BYNToUSD(BYN);
    }

    @Override
    public Double salaryInEURO(Double BYN) {
        return salaryService.BYNtoEURO(BYN);
    }

}

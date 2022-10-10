package com.example.demo.service.impl;

import com.example.demo.service.SalaryService;
import org.springframework.stereotype.Service;

@Service
public class SalaryServiceImpl implements SalaryService {
    @Override
    public Double BYNToUSD(Double BYN) {
        return BYN > 0 ? BYN / 2.53 : 0;
    }


    @Override
    public Double BYNtoEURO(Double BYN) {
        return BYN > 0 ? BYN / 2.46 : 0;
    }
}

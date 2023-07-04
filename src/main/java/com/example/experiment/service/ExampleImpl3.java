package com.example.experiment.service;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

@Order(3)
@Service
public class ExampleImpl3 implements Example {
    @Override
    public void print() {
        System.out.println("Example 3");
    }
}

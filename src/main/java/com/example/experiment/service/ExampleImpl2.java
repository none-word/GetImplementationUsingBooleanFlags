package com.example.experiment.service;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

@Order(2)
@Service
public class ExampleImpl2 implements Example {
    @Override
    public void print() {
        System.out.println("Example 2");
    }
}

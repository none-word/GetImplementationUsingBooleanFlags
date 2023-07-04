package com.example.experiment;

import com.example.experiment.service.Example;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import java.util.List;

@RequiredArgsConstructor
@SpringBootApplication
public class ExperimentApplication {

    @Autowired
    private final List<Example> exampleList;

    public static void main(String[] args) {
        SpringApplication.run(ExperimentApplication.class, args);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void start() {
        String combination = "11";
        int decimal = Integer.parseInt(combination, 2);
        exampleList.get(decimal).print();
    }
}

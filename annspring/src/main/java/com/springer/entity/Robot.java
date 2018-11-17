package com.springer.entity;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Robot {

    public void sayHello() {
        System.err.println("Hello");
    }

    @PostConstruct
    public void init() {
        System.err.println("Init. method of Robot.class");
    }

    @PreDestroy
    public void destroy() {
        System.err.println("Destroy method of Robot.class");
    }
}
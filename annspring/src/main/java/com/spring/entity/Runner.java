package com.spring.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Runner {
    private Robot robot;

    @Value("${name}")
    private String name;

    @Autowired
    public void setRobot(Robot robot) {
        this.robot = robot;
    }

    @PostConstruct
    public void init() {
        System.err.println("Init. method of Runner.class");
    }

    public void speakRobot() {
        robot.sayHello();
        System.err.println("My name is: " + name);
    }

    @PreDestroy
    public void destroy() {
        System.err.println("Destroy method of Runner.class");
    }
}
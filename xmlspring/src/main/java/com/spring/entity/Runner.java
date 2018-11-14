package com.spring.entity;

public class Runner {
    private Robot robot;

    public void setRobot(Robot robot) {
        this.robot = robot;
    }

    public void speakRobot() {
        robot.sayHello();
    }

    public void destroy() {
        System.out.println("Destroy method of Runner.class");
    }
}

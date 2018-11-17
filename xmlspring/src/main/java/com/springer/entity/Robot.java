package com.springer.entity;

public class Robot {
    private String name;
    private int age;
    private Printable printable;

    void sayHello() {
        System.out.println("Hello! " + name + "age " + age);
        printable.print();
    }

    public void setPrintable(Printable printable) {
        this.printable = printable;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void destroy() {
        System.out.println("Destroy method of Robot.class");
    }
}

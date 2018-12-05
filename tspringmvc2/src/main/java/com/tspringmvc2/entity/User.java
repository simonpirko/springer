package com.tspringmvc2.entity;

import javax.validation.constraints.Size;
import java.io.Serializable;

public class User implements Serializable {

    private int id;

    @Size(min = 3, message = "Enter valid name!")
    private String name;

    private int age;

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Main{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

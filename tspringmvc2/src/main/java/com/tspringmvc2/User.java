package com.tspringmvc2;

import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.Map;

public class User {
    private Integer age;
    private Map<String, Integer> names;

    public static void main(String[] args) {
        GenericXmlApplicationContext genericXmlApplicationContext = new GenericXmlApplicationContext();
        genericXmlApplicationContext.load("root-context.xml");
        genericXmlApplicationContext.refresh();
        User user = (User) genericXmlApplicationContext.getBean("user");
        user.names.forEach((s, integer) -> {
            System.out.print(s + "=");
            System.out.println(integer);
        });
        System.out.println(user.age);
    }

    public void setNames(Map<String, Integer> names) {
        this.names = names;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}

package com.tspringmvc2;

import org.springframework.context.support.GenericXmlApplicationContext;

import javax.servlet.ServletException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

public class Main {
    private Integer age;
    private Map<String, Integer> names;

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException, ServletException {
        GenericXmlApplicationContext genericXmlApplicationContext = new GenericXmlApplicationContext();
        genericXmlApplicationContext.load("root-context.xml");
        genericXmlApplicationContext.refresh();
        Main user = (Main) genericXmlApplicationContext.getBean("user");

        user.names.forEach((s, integer) -> {
            System.out.print(s + "=");
            System.out.println(integer);
        });
        System.out.println(user.age);

        Method[] methods = user.getClass().getMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(IsMyAnnotation.class)) {
                method.invoke(new Main());
            }
        }
    }

    @IsMyAnnotation
    public void abc() {
        System.out.println("abc");
    }

    @IsMyAnnotation
    public void dcb() {
        System.out.println("dcb");
    }

    public void setNames(Map<String, Integer> names) {
        this.names = names;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}

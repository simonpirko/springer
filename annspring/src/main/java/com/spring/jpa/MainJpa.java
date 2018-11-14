package com.spring.jpa;

import com.spring.jpa.entity.Person;
import com.spring.jpa.services.PersonServiceImpl;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainJpa {
    public static void main(String[] args) {
        GenericXmlApplicationContext genericXmlApplicationContext = new GenericXmlApplicationContext();
        genericXmlApplicationContext.load("app-conf.xml");
        genericXmlApplicationContext.refresh();
        PersonServiceImpl personService = genericXmlApplicationContext.getBean("personService", PersonServiceImpl.class);
        Person person = new Person();
        person.setName("Simon");
        person.setAge(24);
        personService.save(person);
        personService.findAll().forEach(System.out::println);
    }
}

package com.springer.datajpa;

import com.springer.datajpa.entity.Human;
import com.springer.datajpa.services.HumanService;
import org.springframework.context.support.GenericXmlApplicationContext;

public class DataJpaMain {
    public static void main(String[] args) {
        GenericXmlApplicationContext genericXmlApplicationContext = new GenericXmlApplicationContext();
        genericXmlApplicationContext.load("app-conf.xml");
        genericXmlApplicationContext.refresh();
        HumanService humanService = genericXmlApplicationContext.getBean("humanService", HumanService.class);
        Human human = new Human();

        human.setName("Simon");
        human.setAge(24);
        humanService.save(human);

        human.setId(2L);
        human.setName("Denis");
        human.setAge(23);
        humanService.save(human);

        humanService.findAllHumans().forEach(System.out::println);
    }
}

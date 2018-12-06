package com.springer.bean;

import com.springer.entity.Runner;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainBeanXml {
  public static void main(String[] args) {
    ClassPathXmlApplicationContext applicationContext =
        new ClassPathXmlApplicationContext("application-context.xml");
    applicationContext.registerShutdownHook();
    Runner runner = applicationContext.getBean("runner", Runner.class);
    runner.speakRobot();
  }
}
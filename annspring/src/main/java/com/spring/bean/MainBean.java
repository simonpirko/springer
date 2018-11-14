package com.spring.bean;

import com.spring.entity.Runner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@ComponentScan({"com.spring.*"})
@PropertySource({"classpath:application.properties"})
//@Configuration
public class MainBean {

    //    @Bean
//    public Robot robot(){
//        return new Robot();
//    }

    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext =
                new AnnotationConfigApplicationContext(MainBean.class);
        annotationConfigApplicationContext.registerShutdownHook();
        Runner runner = annotationConfigApplicationContext.getBean("runner", Runner.class);
        runner.speakRobot();
    }
}
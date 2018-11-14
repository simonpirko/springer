package com.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainJdbcXml {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("application-context.xml");
        JdbcContactDao jdbcContactDao = applicationContext.getBean("jdbcContactDao", JdbcContactDao.class);
        jdbcContactDao.save();

    }
}

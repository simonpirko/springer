package com.spring.jdbc;

import org.springframework.context.support.GenericXmlApplicationContext;

//@ComponentScan({"com.spring.jdbc"})
//@Configuration
public class MainJdbc {

    public static void main(String[] args) {
        GenericXmlApplicationContext applicationContext = new GenericXmlApplicationContext();
        applicationContext.load("app-conf.xml");
        applicationContext.refresh();
        JdbcContactDao contactDao = applicationContext.getBean("jdbcContactDao", JdbcContactDao.class);
        contactDao.save();
    }
}

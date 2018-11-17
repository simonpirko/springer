package com.springer.hibernate;

import com.springer.hibernate.entity.User;
import org.springframework.context.support.GenericXmlApplicationContext;

public class HibernateMain {
    public static void main(String[] args) {
        GenericXmlApplicationContext applicationContext = new GenericXmlApplicationContext();
        applicationContext.load("app-conf.xml");
        applicationContext.refresh();
        HibernateDao hibernateDao = applicationContext.getBean("hibernateDao", HibernateDao.class);
        User user = new User();
        user.setName("Simon");
        user.setVipId(1);
        hibernateDao.save(user);
//        hibernateDao.findAll();
    }
}

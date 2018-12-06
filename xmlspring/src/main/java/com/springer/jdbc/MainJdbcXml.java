package com.springer.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;

public class MainJdbcXml {
  private ArrayList<Integer> arrayList;

  public MainJdbcXml() {
    arrayList = new ArrayList<>();
  }

  public static void main(String[] args) {
    MainJdbcXml mainJdbcXml = new MainJdbcXml();
    mainJdbcXml.arrayList.add(2);
    String helloMyname = "Simon";
    System.out.println(helloMyname);
    ApplicationContext applicationContext =
        new ClassPathXmlApplicationContext("application-context.xml");
    JdbcContactDao jdbcContactDao = applicationContext.getBean("jdbcContactDao", JdbcContactDao.class);
    jdbcContactDao.save();

  }
}

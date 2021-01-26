package com.learn.hibernate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigurationMain {
  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext("/hibernate/configuration/xml/xml-config.xml");

    HibernateDaoImpl dao = (HibernateDaoImpl) context.getBean("hibernateDaoImpl");
    dao.getPersons();
  }
}

package com.learn.hibernate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("/hibernate/spring-hibernate.xml");

        TestHibernateService service = (TestHibernateService) context.getBean("testHibernateService");
        service.doSomething();
    }
}

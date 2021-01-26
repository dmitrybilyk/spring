package com.learn.configuration.java;

import com.learn.configuration.domain.controller.ExampleController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigurationMain {
  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext("/configuration.java/applicationContext.xml");

    UserOfRequiredBean controller = (UserOfRequiredBean) context.getBean("userOfRequiredBean");
//    controller.handleRequest("Some name", 100);
  }
}

package com.learn.configuration.java;

import com.learn.configuration.domain.controller.ExampleController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigurationMain {
  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext("/configuration.java/applicationContext.xml");

    ExampleController controller = (ExampleController) context.getBean("exampleController");
    controller.handleRequest("Some name", 100);
  }
}

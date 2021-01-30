package com.learn.configuration.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigurationMain {
  public static void main(String[] args) {
    ApplicationContext context = new AnnotationConfigApplicationContext(ExampleConfiguration.class);

    UserOfRequiredBean controller = (UserOfRequiredBean) context.getBean("userOfRequiredBean");
    controller.print();
  }
}

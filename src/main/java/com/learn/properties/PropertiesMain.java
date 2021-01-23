package com.learn.properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PropertiesMain {
  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext("/properties/applicationContext.xml");

    SomePropertiesUsedBean bean = (SomePropertiesUsedBean) context.getBean("somePropertiesUsedBean");
    bean.someMethod();
  }
}

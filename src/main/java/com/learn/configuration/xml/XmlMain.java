package com.learn.configuration.xml;

import com.learn.configuration.domain.controller.ExampleController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("/configuration/xml/applicationContext.xml");

        ExampleController controller = (ExampleController) context.getBean("exampleController");
        controller.handleRequest("Some name", 100);
    }
}

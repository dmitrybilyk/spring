package com.learn.factory_method;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext xmlConfigContext =
                new ClassPathXmlApplicationContext("factory_method/factory-method.xml");
        Foo foo = (Foo)xmlConfigContext.getBean("foo");
    }
}

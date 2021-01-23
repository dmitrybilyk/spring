package com.learn.lookup_method;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// When we have a singleton and we want to have inside the bean with scope prototype
// Here we have the same passenger
public class WithoutLookupMethodMain {

    public static void main(String[] args) {
        ApplicationContext xmlConfigContext =
                new ClassPathXmlApplicationContext("lookup_method/without-lookup-method.xml");
        CarWithoutLookup car = xmlConfigContext.getBean(CarWithoutLookup.class);
        System.out.println(car.drive("John"));
        System.out.println(car.drive("Michel"));
    }
}

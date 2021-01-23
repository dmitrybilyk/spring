package com.learn.lookup_method;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// When we have a singleton and we want to have inside the bean with scope prototype
public class WithLookupMethodMain {

    public static void main(String[] args) {
        ApplicationContext xmlConfigContext =
                new ClassPathXmlApplicationContext("lookup_method/with-lookup-method.xml");
        CarWithLookup car = xmlConfigContext.getBean(CarWithLookup.class);
        System.out.println(car.drive("John").equals("car with John"));
        System.out.println(car.drive("Michel").equals("car with Michel"));
    }
}

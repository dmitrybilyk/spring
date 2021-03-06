package com.learn.cachable;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by dmitry on 1/29/14.
 */
public class SpringDemo{
public static void main(String... args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.cachable/cachable-spring.xml");
        Employee employee=(Employee) context.getBean("employee");

        //calling getEmployee method first time.
        System.out.println(employee.getEmployee(1));

        //calling getEmployee method second time. This time, method will not execute.
        System.out.println(employee.getEmployee(1));
        System.out.println(employee.getEmployee(1));
        System.out.println(employee.getEmployee(1));
        System.out.println(employee.getEmployee(1));

        //calling getEmployee method third time with different value.
        System.out.println(employee.getEmployee(2));
        }
}
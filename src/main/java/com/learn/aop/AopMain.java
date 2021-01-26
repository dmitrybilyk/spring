package com.learn.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 * User: bilyk
 * Date: 04.07.12
 * Time: 15:55
 * To change this template use File | Settings | File Templates.
 */
public class AopMain {
    public static void main(String[] args){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("/aop/Spring-aop.xml");
        MyService myService = applicationContext.getBean("myService", MyService.class);
        myService.method1(new ArrayList<>());
    }
}

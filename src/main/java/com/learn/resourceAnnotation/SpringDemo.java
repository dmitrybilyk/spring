package com.learn.resourceAnnotation;

import com.learn.configuration.java.ExampleConfiguration;
import com.learn.configuration.java.UserOfRequiredBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by dmitry on 1/29/14.
 */
public class SpringDemo {

    public static void main(String... args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ResourceAnnotationConfiguration.class);
        Student st=(Student) context.getBean("student");
        String city=st.getCity().getCityName();
        System.out.println(city);
    }
}
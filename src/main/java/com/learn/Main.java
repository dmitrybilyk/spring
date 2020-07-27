package com.learn;

import com.learn.controllers.SomeController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Main {

    public static void main(String[] args) {
        ApplicationContext context
                = new ClassPathXmlApplicationContext(
                "applicationContext.xml");

        SomeController controller = (SomeController) context.getBean("someController");
        controller.useSomeService();
    }
}
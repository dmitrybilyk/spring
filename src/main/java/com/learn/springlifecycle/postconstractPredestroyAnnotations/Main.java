package com.learn.springlifecycle.postconstractPredestroyAnnotations;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by dmitry on 22.01.15.
 */
public class Main {
    public static void main(String[] args) {
        AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext(new String[] {"spring.lifecycle/lifecycle-context.xml"});
        PostConstructPreDestroyBean bean = (PostConstructPreDestroyBean) applicationContext.getBean("postConstPreDestrBean");
        System.out.println(bean.toString());

        applicationContext.close();
    }
}

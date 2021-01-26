package com.learn.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.stream.Collectors;

@Aspect
//Aspect - is a module which encopsulates the behavior that should be
//executed (loggin aspect for instance).
@Component
public class MyAspect {

//    Joinpoint - is a point where behavior will be plugged in.
//    "execution(public * com.learn.aop.MyService.*(..))" - example of joinpoint, could be several of them
    @Pointcut("execution(public * com.learn.aop.MyService.*(..))")
//    Pointcut - is a set of one or more joinpoints where advice should be executed.
    public void callAtMyServicePublic() { }

    @Before("callAtMyServicePublic()")
    public void beforeCallAtMethod1(JoinPoint jp) {
        String args = Arrays.stream(jp.getArgs())
                .map(a -> a.toString())
                .collect(Collectors.joining(","));
        System.out.println("before " + jp.toString() + ", args=[" + args + "]");
//        Concern - behavior we want to implement.
//        Crosscutting conserns - concerns which are needed everywhere in the project.
    }

    @After("callAtMyServicePublic()")
//    Advice - actual action, actual peace of code that is invoked during
//the program execution bye the Spring AOP framework. (before, after, after-returning,
//after-throwing, around).
    public void afterCallAt(JoinPoint jp) {
        System.out.println("after " + jp.toString());
    }
}
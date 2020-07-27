package com.learn.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Aspect
@EnableAspectJAutoProxy
public class SomeAspect {
    @Before("execution(* com.learn.controllers.SomeController.useSomeService(..))")
    public void LoggingAdvice(){
        System.out.println("Advice run. Some method called");
    }
}

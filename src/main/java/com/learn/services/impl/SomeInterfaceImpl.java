package com.learn.services.impl;

import com.learn.repositories.SomeDaoRepo;
import com.learn.services.SomeInterface;

public class SomeInterfaceImpl implements SomeInterface {
    private SomeDaoRepo someDaoRepo;
    public void someMethod() {
        System.out.printf("Some method impl");
        someDaoRepo.someDaoMethod();
    }
}

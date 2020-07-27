package com.learn.services.impl;

import com.learn.repositories.SomeDaoRepo;
import com.learn.services.SomeInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SomeInterfaceImpl implements SomeInterface {
    @Autowired
    private SomeDaoRepo someDaoRepo;
    public void someMethod() {
        System.out.println("Some method impl");
        someDaoRepo.someDaoMethod();
    }
}

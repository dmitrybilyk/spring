package com.learn.services.impl;

import com.learn.repositories.SomeDaoRepo;
import com.learn.services.SomeInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SomeInterfaceImpl2 implements SomeInterface {
    private final SomeDaoRepo someDaoRepo;

    public SomeInterfaceImpl2(SomeDaoRepo someDaoRepo) {
        this.someDaoRepo = someDaoRepo;
    }

    public void someMethod() {
        System.out.println("Some method impl2");
        someDaoRepo.someDaoMethod();
    }
}

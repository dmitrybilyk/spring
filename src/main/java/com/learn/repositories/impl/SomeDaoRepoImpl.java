package com.learn.repositories.impl;

import com.learn.repositories.SomeDaoRepo;
import org.springframework.stereotype.Repository;

@Repository
public class SomeDaoRepoImpl implements SomeDaoRepo {
    public void someDaoMethod() {
        System.out.println("Some Repo Impl");
    }
}

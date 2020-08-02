package com.learn.configuration;


//@Service
public class ServiceImpl {
    private RepositoryImpl repository;

    public ServiceImpl(RepositoryImpl repository) {
        this.repository = repository;
    }
}

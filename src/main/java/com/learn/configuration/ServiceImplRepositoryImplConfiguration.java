package com.learn.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceImplRepositoryImplConfiguration {
    @Bean
    public RepositoryImpl repository() {
        return new RepositoryImpl();
    }
    @Bean
    public ServiceImpl service() {
        return new ServiceImpl(repository());
    }
}

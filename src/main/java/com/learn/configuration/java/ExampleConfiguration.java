package com.learn.configuration.java;

import com.learn.configuration.domain.controller.ExampleController;
import com.learn.configuration.domain.dao.ExampleDao;
import com.learn.configuration.domain.dao.ExampleDaoImpl;
import com.learn.configuration.domain.service.ExampleService;
import com.learn.configuration.domain.service.ExampleServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ExampleConfiguration {
  @Bean
  public ExampleDao exampleDao() {
    return new ExampleDaoImpl();
  }
  @Bean
  public ExampleService exampleService() {
    return new ExampleServiceImpl(exampleDao());
  }
  @Bean
  public ExampleController exampleController() {
    return new ExampleController(exampleService());
  }

  @Bean
  public UserOfRequiredBean userOfRequiredBean() {
    return new UserOfRequiredBean();
  }
}

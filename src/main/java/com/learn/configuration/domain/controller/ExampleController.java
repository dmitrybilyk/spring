package com.learn.configuration.domain.controller;

import com.learn.configuration.domain.dto.SomeDto;
import com.learn.configuration.domain.service.ExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ExampleController {
  private final ExampleService exampleService;

  @Autowired
  public ExampleController(ExampleService exampleService) {
    this.exampleService = exampleService;
  }

  public void handleRequest(String name, int value) {
    exampleService.doSomething(new SomeDto(name, value));
  }

}

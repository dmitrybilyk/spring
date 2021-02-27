package com.learn.configuration.domain.service;

import com.learn.configuration.domain.dto.SomeDto;

public interface ExampleService {
  void doSomething(SomeDto someDto);
  int returnSomething(SomeDto someDto);
  int returnSomethingWithStaticUsage(SomeDto someDto);
}

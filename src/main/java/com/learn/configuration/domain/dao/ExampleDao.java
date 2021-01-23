package com.learn.configuration.domain.dao;

import com.learn.configuration.domain.dto.SomeDto;

public interface ExampleDao {
  void doSomething(SomeDto someDto);

  int returnSomething(SomeDto someDto);
}

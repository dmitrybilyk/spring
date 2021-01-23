package com.learn.configuration.domain.dao;

import com.learn.configuration.domain.dto.SomeDto;
import org.springframework.stereotype.Repository;

@Repository
public class ExampleDaoImpl implements ExampleDao {
  @Override
  public void doSomething(SomeDto someDto) {
    System.out.println("Persisting dto to db");
  }

  @Override
  public int returnSomething(SomeDto someDto) {
    return 20;
  }
}

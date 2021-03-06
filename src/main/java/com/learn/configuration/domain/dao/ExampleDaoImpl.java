package com.learn.configuration.domain.dao;

import com.learn.configuration.domain.dto.SomeDto;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
//@Qualifier("exampleDaoImpl")
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

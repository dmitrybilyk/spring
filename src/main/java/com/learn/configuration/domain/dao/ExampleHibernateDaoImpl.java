package com.learn.configuration.domain.dao;

import com.learn.configuration.domain.dto.SomeDto;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository
//@Qualifier("exampleHibernateDaoImpl")
//@Primary
public class ExampleHibernateDaoImpl implements ExampleDao {
  @Override
  public void doSomething(SomeDto someDto) {
    System.out.println("Persisting dto to db with hibernate");
  }

  @Override
  public int returnSomething(SomeDto someDto) {
    return 20;
  }
}

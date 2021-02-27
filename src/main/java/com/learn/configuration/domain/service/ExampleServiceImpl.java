package com.learn.configuration.domain.service;

import com.learn.configuration.domain.dao.ExampleDao;
import com.learn.configuration.domain.dto.SomeDto;
import lombok.AllArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Setter
public class ExampleServiceImpl implements ExampleService {
  private ExampleDao exampleDao;

  @Autowired
//  public ExampleServiceImpl(@Qualifier("exampleHibernateDaoImpl") ExampleDao exampleDao) {
  public ExampleServiceImpl(ExampleDao exampleHibernateDaoImpl) {
    this.exampleDao = exampleHibernateDaoImpl;
  }

  @Override
  public void doSomething(SomeDto someDto) {
    exampleDao.doSomething(someDto);
  }

  @Override
  public int returnSomething(SomeDto someDto) {
    return exampleDao.returnSomething(someDto);
  }

  @Override
  public int returnSomethingWithStaticUsage(SomeDto someDto) {
    String result = someStaticMethod("some value");
    if (result.equals("Dima")) {
      System.out.println(result.length());
      someDto.setDtoName(result);
      return exampleDao.returnSomething(someDto);
    } else {
      return 4;
    }

  }

  public static String someStaticMethod(String value) {
    return value;
  }

}

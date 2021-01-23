package com.learn.configuration.domain.service;

import com.learn.configuration.domain.dao.ExampleDao;
import com.learn.configuration.domain.dto.SomeDto;
import lombok.AllArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Setter
public class ExampleServiceImpl implements ExampleService {
  private ExampleDao exampleDao;

  public ExampleServiceImpl(ExampleDao exampleDao) {
    this.exampleDao = exampleDao;
  }

  @Override
  public void doSomething(SomeDto someDto) {
    exampleDao.doSomething(someDto);
  }

  @Override
  public int returnSomething(SomeDto someDto) {
    return exampleDao.returnSomething(someDto);
  }

}
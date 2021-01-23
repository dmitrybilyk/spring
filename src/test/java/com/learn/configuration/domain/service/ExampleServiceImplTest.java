package com.learn.configuration.domain.service;

import com.learn.configuration.domain.dao.ExampleDao;
import com.learn.configuration.domain.dto.SomeDto;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:applicationContext.xml"})
public class ExampleServiceImplTest {
  public ExampleServiceImplTest() {
  }

  private ExampleDao exampleDaoMock = Mockito.mock(ExampleDao.class);
  @Autowired
  private ExampleServiceImpl exampleService;

  @Before
  public void setUp() throws Exception {
  }

  @Test
  public void doSomething() {
    Mockito.when(exampleDaoMock.returnSomething(Mockito.any())).thenReturn(2);
    exampleService.setExampleDao(exampleDaoMock);
    Assert.assertEquals(2, exampleService.returnSomething(new SomeDto("some name", 10)));
  }
}
package com.learn.properties;

import com.learn.configuration.domain.dao.ExampleDao;
import com.learn.configuration.domain.dto.SomeDto;
import com.learn.configuration.domain.service.ExampleServiceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:properties/applicationContext.xml"})
public class SomePropertiesUsedBeanTest {
  public SomePropertiesUsedBeanTest() {
  }

  @Autowired
  private SomePropertiesUsedBean somePropertiesUsedBean;

  @Before
  public void setUp() throws Exception {
  }

  @Test
  public void doSomething() {
    somePropertiesUsedBean.someMethod();
  }
}
package com.learn.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

@Service
@PropertySource("classpath:properties/application.properties")
public class SomePropertiesUsedBean {
  @Value("${someKey}")
  private String someValue;

  public void someMethod() {
    System.out.println(someValue);
  }
}

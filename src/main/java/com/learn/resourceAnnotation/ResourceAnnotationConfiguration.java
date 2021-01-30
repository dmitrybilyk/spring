package com.learn.resourceAnnotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ResourceAnnotationConfiguration {


  @Bean
  public City city() {
    return new City();
  }

  @Bean
  public Student student() {
    Student student = new Student();
//    student.setCity(city());
    return student;
  }

}

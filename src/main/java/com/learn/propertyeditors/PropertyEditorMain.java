package com.learn.propertyeditors;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PropertyEditorMain {
  public static void main(String[] args) {
    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("custompropertyeditor/property-editor-context.xml");
    Student student = (Student) applicationContext.getBean("student");
    System.out.println(student.getBook().getBookName());
  }
}

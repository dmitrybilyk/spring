package com.learn.propertyeditors;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Data
public class Student {
  private Book book;
}

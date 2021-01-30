package com.learn.configuration.java;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

//@Component
public class UserOfRequiredBean {

  private RequiredBean requiredBean;

  private String requiredString;

//  @Autowired
//  public UserOfRequiredBean(RequiredBean requiredBean) {
//    this.requiredBean = requiredBean;
//  }

  public void print() {
    System.out.println("fdfdf");
  }

  @Required
  public void setRequiredString(String requiredString) {
    this.requiredString = requiredString;
  }

  //  - deprecated, use constructor injection for required beans instead
  public void setRequiredBean(RequiredBean requiredBean) {
    this.requiredBean = requiredBean;
  }
}

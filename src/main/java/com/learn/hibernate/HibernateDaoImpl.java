package com.learn.hibernate;

import com.learn.hibernate.model.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class HibernateDaoImpl {
  @Autowired
  private SessionFactory sessionFactory;

  public void getPersons() {
    Session session = sessionFactory.openSession();
    session.save(new Person());
    System.out.println(session.find(Person.class, 1));

  }
}

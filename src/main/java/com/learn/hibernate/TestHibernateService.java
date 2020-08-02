package com.learn.hibernate;

import com.learn.hibernate.model.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;


@Repository
@Transactional
public class TestHibernateService {

    private final SessionFactory sessionFactory;

    public TestHibernateService(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void doSomething() {

        Session session = sessionFactory.openSession();
        Person personToSave = new Person();
        personToSave.setName("person name");



        Transaction transaction = session.beginTransaction();
        session.save(personToSave);
//        session.
//        transaction.commit();
//        session.close();
//
//        Session session = FirstLevelCashHibernateAnnotationUtil.getSessionFactory().openSession();
//        session.beginTransaction();
        //first level cache
        Person person = (Person) session.get(Person.class, 1);
        Person person2 = (Person) session.get(Person.class, 1);
//        Person person3 = (Person) session.get(Person.class, 1);
        transaction.commit();
        System.out.println(personToSave.getName());
    }
}

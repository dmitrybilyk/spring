package com.learn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Student {
    private int no;
    private String name;

    private Book book;
    private List<Book> bookList;

//    @Autowired
    public Student(Book book, List<Book> books) {
        this.book = book;
        this.bookList = books;
    }

    public Student() {
    }


    public Book getBook() {
        return book;
    }



    @Autowired
    public void setBook2(Book book2) {
        this.book = book2;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Book> getBookList() {
        return bookList;
    }

//    @Autowired
    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    public static void main(String[] args) {
        ApplicationContext context
                = new ClassPathXmlApplicationContext(
                "applicationContext.xml");

        Student student = (Student) context.getBean("student");

        Student sameStudent = context.getBean("student", Student.class);
        System.out.println(sameStudent.getName());
    }
}
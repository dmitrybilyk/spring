package com.learn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Student {
    private int no;
    private String name;
    private Book book;
    private List<Book> bookList;

    public Student(Book book, List<Book> books) {
        this.book = book;
        this.bookList = books;
    }

    public Book getBook() {
        return book;
    }


//
//    public void setBook(Book book) {
//        this.book = book;
//    }

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
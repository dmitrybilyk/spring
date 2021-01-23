package com.learn.propertyeditors;

import java.beans.PropertyEditorSupport;

public class BookPropertyEditor extends PropertyEditorSupport {
  @Override
  public String getAsText() {
    Book book = (Book) getValue();
    return book == null? "": book.getBookName();
  }

  @Override
  public void setAsText(String text) throws IllegalArgumentException {
    Book book = new Book();
    book.setBookName(text);
    setValue(book);
  }
}

package com.learn;

import org.springframework.stereotype.Component;

@Component
public class Book2 {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

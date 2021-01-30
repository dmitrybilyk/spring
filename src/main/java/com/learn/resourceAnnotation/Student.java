package com.learn.resourceAnnotation;

/**
 * Created by dmitry on 1/29/14.
 */
import javax.annotation.Resource;

public class Student {
    @Resource
    private City city;

    public City getCity() {
        return city;
    }
    public void setCity(City city) {
        this.city = city;
    }
}
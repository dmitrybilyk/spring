package com.learn.lookup_method;

import org.springframework.stereotype.Component;

@Component
public class CarWithoutLookup {

    private Passenger passenger;

    public CarWithoutLookup(Passenger passenger) {
        this.passenger = passenger;
    }

    public String drive(String name) {
        return passenger.toString();
    }
}
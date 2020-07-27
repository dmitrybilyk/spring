package com.learn.controllers;

import com.learn.services.SomeInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class SomeController {

    private final SomeInterface someInterfaceImpl2;

    public SomeController(SomeInterface someInterfaceImpl2) {
        this.someInterfaceImpl2 = someInterfaceImpl2;
    }

    public void useSomeService() {
        someInterfaceImpl2.someMethod();
    }
}

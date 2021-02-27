package com.learn;

import java.util.AbstractList;

public class MyList extends AbstractList<String> {

    @Override
    public String get(int index) {
        return null;
    }

    @Override
    public void add(int index, String element) {
        // no-op
    }

    @Override
    public int size() {
        return 0;
    }
}
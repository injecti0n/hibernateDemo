package com.hibernateDemo;

import java.util.List;

public class EntityManagerExample {
    private List<Object> objects;

    public void persist(Object o) {
        objects.add(o);
    }

    public void commit() {
        objects.stream().forEach(o -> saveObjectToDatabase(o));
    }

    private void saveObjectToDatabase(Object o) {

    }
}

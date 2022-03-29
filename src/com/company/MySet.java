package com.company;

public interface MySet {

    interface MyEntry {
        Object obj = null;
        int hash = 0;
        String toString();
    }

    boolean add(Object o);

    void clear();

    boolean contains(Object o);

    boolean isEmpty();

    boolean remove(Object o);

    int size();

    Object[] toArray();
}
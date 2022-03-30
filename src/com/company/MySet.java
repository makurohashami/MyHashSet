package com.company;

public interface MySet<K> {

    interface MyEntry<K> {
        Object obj = null;
        int hash = 0;
        String toString();
    }

    boolean add(K o);

    void clear();

    boolean contains(K o);

    boolean isEmpty();

    boolean remove(K o);

    int size();

    MyEntry[] toArray();
}
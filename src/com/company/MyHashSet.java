package com.company;

public class MyHashSet  implements MySet{
    public boolean add(Object o) {
        return false; //Заглушка
    }

    public void clear() {
    }

    public boolean contains(Object o) {
        return false; //Заглушка
    }

    public boolean isEmpty() {
        return false; //Заглушка
    }

    public boolean remove(Object o) {
        return false; //Заглушка
    }

    public int size() {
        return 0; //Заглушка
    }

    public String[] toArray() {
        return new String[10]; //Заглушка
    }
}

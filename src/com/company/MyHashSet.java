package com.company;

import java.util.Arrays;

public class MyHashSet implements MySet{

    private int size = 0;
    private int capacity = 16;
    private final double loadFactor = 0.75;
    private double threshold = capacity * loadFactor;
    public MyEntry[] table = new MyEntry[capacity];

    public MyHashSet() {}
    public MyHashSet(int capacity) {
        resize(capacity < Integer.MAX_VALUE / 2 ? capacity : Integer.MAX_VALUE / 2);
    }

    public boolean add(Object o) {
        if(size > threshold) { resize(capacity * 2); }
        table[size] = new MyEntry(o, size);
        size++;
        return true;
    }

    public void clear() {
        size = 0;
        capacity = 16;
        threshold = capacity * loadFactor;
        table = new MyEntry[capacity];
    }

    public boolean contains(Object o) {
        for(int i = 0; i < size; i++) {
            if(table[i].hash == o.hashCode())
                return true;
        }
        return false;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean remove(Object o) {
        if(!contains(o)) { return false; }
        MyEntry[] tableTemp = new MyEntry[capacity];
        System.arraycopy(table, 0, tableTemp, 0, getObjIndex(o));
        System.arraycopy(table, (getObjIndex(o) + 1), tableTemp, getObjIndex(o), (size - getObjIndex(o) - 1));
        table = tableTemp;
        size--;
        return true;
    }

    public int size() {
       return size;
    }

    public Object[] toArray() {
        MyEntry[] tableTemp = new MyEntry[size];
        System.arraycopy(table, 0, tableTemp, 0, size);
        return tableTemp;
    }

    public String toString() {
        return Arrays.toString(toArray());
    }

    private int getObjIndex(Object o) {
        for(int i = 0; i < size; i++) {
            if(table[i].hash == o.hashCode())
                return i;
        }
        return 0;
    }

    private void resize(int capacity) {
        this.capacity = capacity;
        threshold = this.capacity * loadFactor;
        MyEntry[] tableTemp = new MyEntry[this.capacity];
        System.arraycopy(table, 0, tableTemp, 0, table.length);
        table = tableTemp;
    }

    private static class MyEntry {
        private Object obj;
        private int hash;
        private int position;

        public MyEntry(Object obj, int size) {
            this.obj = obj;
            this.position = size;
            this.hash = obj.hashCode();
        }

        public String toString() {
            return obj.toString();
        }
    }
}
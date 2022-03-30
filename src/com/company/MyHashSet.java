package com.company;

import java.util.Arrays;

public class MyHashSet<K> implements MySet<K>{

    private int size = 0;
    private int capacity = 16;
    private final double loadFactor = 0.75;
    private double threshold = capacity * loadFactor;
    private Entry[] table = new Entry[capacity];

    public MyHashSet() {}
    public MyHashSet(int capacity) {
        resize(Math.min(capacity, Integer.MAX_VALUE / 2));
    }

    public boolean add(K o) {
        if(size > threshold) { resize(capacity * 2); }
        if(contains(o)) {return false;}
        table[size] = new Entry<>(o);
        size++;
        return true;
    }

    public void clear() {
        size = 0;
        capacity = 16;
        threshold = capacity * loadFactor;
        table = new Entry[capacity];
    }

    public boolean contains(K o) {
        if(o == null) { return false; }
        for(int i = 0; i < size; i++) {
            if(table[i].hash == o.hashCode())
                return true;
        }
        return false;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean remove(K o) {
        if(!contains(o)) { return false; }
        Entry[] tableTemp = new Entry[capacity];
        System.arraycopy(table, 0, tableTemp, 0, getObjIndex(o));
        System.arraycopy(table, (getObjIndex(o) + 1), tableTemp, getObjIndex(o), (size - getObjIndex(o) - 1));
        table = tableTemp;
        size--;
        return true;
    }

    public int size() {
       return size;
    }

    //todo Попробовать возвращать <K>
    public Entry[] toArray() {
        Entry[] tableTemp = new Entry[size];
        System.arraycopy(table, 0, tableTemp, 0, size);
        return tableTemp;
    }

    public String toString() {
        return Arrays.toString(toArray());
    }

    //TECHNICAL METHODS

    private int getObjIndex(K o) {
        for(int i = 0; i < size; i++) {
            if(table[i].hash == o.hashCode())
                return i;
        }
        return 0;
    }

    private void resize(int capacity) {
        this.capacity = capacity;
        threshold = this.capacity * loadFactor;
        Entry[] tableTemp = new Entry[this.capacity];
        System.arraycopy(table, 0, tableTemp, 0, size);
        table = tableTemp;
    }

    private static class Entry<K> implements MySet.MyEntry<K>{
        private final K obj;
        private final int hash;

        public Entry(K obj) {
            this.obj = obj;
            this.hash = obj.hashCode();
        }

        public String toString() {
            return obj.toString();
        }
    }
}
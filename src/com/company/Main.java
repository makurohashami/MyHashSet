package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        MySet<String> set = new MyHashSet();
        set.add("5");
        set.add("2");
        set.add("3");
        set.add("8");
        System.out.println(set.size());
        System.out.println(set);
        System.out.println(Arrays.toString(set.toArray()));
        //ALL DONE
        MySet<Integer> setInts = new MyHashSet<>();
        setInts.add(0);
        setInts.add(2);
        setInts.add(3);
        setInts.add(1);
        System.out.println(setInts.size());
        System.out.println(setInts);
        System.out.println(Arrays.toString(setInts.toArray()));
        //ALL DONE
        System.out.println("contains 5 : " + setInts.contains(5));
        System.out.println("contains 2 : " + setInts.contains(2));
        System.out.println("remove 1 : " + setInts.remove(1));
        System.out.println("remove 5 : " + setInts.remove(5));
        System.out.println(setInts);
        System.out.println(setInts.isEmpty());
        System.out.println("Clear");
        setInts.clear();
        System.out.println(setInts.isEmpty());
    }
}

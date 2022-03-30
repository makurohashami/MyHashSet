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
    }
}

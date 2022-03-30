package com.company;

public class Main {

    public static void main(String[] args) {
        MySet set = new MyHashSet(20);
        System.out.println("isEmpty: " + set.isEmpty());
        set.add("Test");
        set.add("522");
        set.add(9);
        set.add(7.5);
        set.add("World");
        System.out.println("Add Hello: " + set.add("Hello"));
        System.out.println("Add Hello: " + set.add("Hello"));
        System.out.println(set);
        System.out.println("Size is: " + set.size());
        System.out.println("Remove 100: " + set.remove("100"));
        System.out.println("Remove World: " + set.remove("World"));
        System.out.println(set);
        System.out.println("Size is: " + set.size());
        System.out.println("Remove Test: " + set.remove("Test"));
        System.out.println("Remove World: " + set.remove("World"));
        System.out.println(set);
        System.out.println("Size is: " + set.size());
        System.out.println();
        set.clear();
        System.out.println(set);
        System.out.println("isEmpty: " + set.isEmpty());
        set.add("Test");
        System.out.println(set);
        System.out.println("contains Test: " + set.contains("Test"));
        System.out.println("contains Tesu: " + set.contains("Tesu"));
        System.out.println();
        System.out.println("Remove Null: " + set.remove(null));
        System.out.println("contains Null: " + set.contains(null));
        System.out.println("add Null: " + set.add(null));

    }
}

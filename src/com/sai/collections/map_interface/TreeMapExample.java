package com.sai.collections.map_interface;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Double, Student> treeMap = new TreeMap<>();

        Student st1 = new Student("Zaur", "Tregulov", 3);
        Student st2 = new Student("Mariya", "Ivanova", 4);
        Student st3 = new Student("Sergey", "Petrov", 1);
        Student st4 = new Student("Igor", "Sidorov", 2);
        Student st5 = new Student("Vasily", "Smirnov", 4);
        Student st6 = new Student("Sasha", "Kapustin", 1);
        Student st7 = new Student("Elena", "Sidorova", 3);


        treeMap.put(5.8, st1);
        treeMap.put(6.4, st2);
        treeMap.put(7.2, st3);
        treeMap.put(7.5, st4);
        treeMap.put(7.9, st5);
        treeMap.put(8.2, st6);
        treeMap.put(9.1, st7);

        Student st8 = new Student("Elena", "Sidorova", 3);

        System.out.println(treeMap.containsKey(st8));

//        System.out.println(treeMap.get(5.8));
//        treeMap.remove(5.8);

//        System.out.println(treeMap.descendingMap()); // развернутый мэп

//        System.out.println(treeMap.tailMap(7.3)); // от 7.3
//        System.out.println(treeMap.headMap(8.3)); // до 8.3

//        System.out.println(treeMap.lastEntry());
//        System.out.println(treeMap.firstEntry());


    }

}

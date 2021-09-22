package com.sai.collections.map_interface;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx1 {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1000, "Zaur Trergulov");
        map1.put(3568, "Ivan Ivanov");
        map1.put(6578, "mariya Sidorova");
        map1.put(15879, "Nickolay Petrov");
        map1.putIfAbsent(1000, "Oleg Ivanov");


        System.out.println(map1);
        System.out.println(map1.get(1000));
        map1.remove(15879);
        System.out.println(map1);
        System.out.println(map1.containsValue("Zaur Trergulov"));
        System.out.println(map1.containsKey(1000));


        Set<Integer> integers = map1.keySet();

        System.out.println(integers);



        for ( Map.Entry<Integer, String> stringEntry: map1.entrySet()) {
            System.out.println("key: " + stringEntry.getKey() + " value: " + stringEntry.getValue());
        }




    }
}

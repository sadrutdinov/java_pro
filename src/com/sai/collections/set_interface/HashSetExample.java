package com.sai.collections.set_interface;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("Zaur");
        set.add("Oleg");
        set.add("Marina");
        set.add("Igor");
//        set.add(null);


        set.remove("Zaur");


        for (String s: set
             ) {
            System.out.println(s);
        }

        System.out.println(set.size());

        System.out.println(set.contains("Alex"));
        System.out.println(set.contains("Marina"));





    }
}

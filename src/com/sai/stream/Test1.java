package com.sai.stream;

import java.util.*;
import java.util.stream.Collectors;

public class Test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("privet");
        list.add("kak dela?");
        list.add("ok");
        list.add("poka");

        List<Integer> collect = list.stream().map(s -> s.length()).collect(Collectors.toList());

//        System.out.println(collect);


        int[] array = {5, 9, 3, 8, 1};

        array = Arrays.stream(array).map(element -> {
            if (element % 3 == 0) {
                element = element / 3;
            }

            return element;
        }).toArray();

//        System.out.println(Arrays.toString(array));


        Set<String> stringSet = new TreeSet<>();
        stringSet.add("privet");
        stringSet.add("kak dela?");
        stringSet.add("ok");
        stringSet.add("poka");

        Set<Integer> collect2 = stringSet.stream().map(s -> s.length()).collect(Collectors.toSet());
        List<Integer> collect3 = stringSet.stream().map(s -> s.length()).collect(Collectors.toList());

        System.out.println(collect2);
        System.out.println(collect3);


    }
}

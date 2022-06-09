package com.modernJavaInAction.chapter341;

import java.util.List;
import java.util.function.IntBinaryOperator;
import java.util.function.IntFunction;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> list = List.of("Hello", "My", "NAme", "", "is radar");



        // predicate in filter()
        List<String> nonEmptyList = list.stream().filter(s -> !s.isEmpty()).collect(Collectors.toList());
        System.out.println("\nPREDICATE RESULT");
        System.out.println(nonEmptyList);


        // consumer in forEach()
        System.out.println("\nCONSUMER RESULT");
        list.forEach(System.out::println);

        // function in map()
        List<Integer> lengthOfWords = list.stream().map(String::length).collect(Collectors.toList());
        System.out.println("\nFUNCTION RESULT");
        System.out.println(lengthOfWords);



    }
}

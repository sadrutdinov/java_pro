package com.sai.stream;

import java.util.stream.Stream;

public class Test6 {
    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(1, 2, 3, 4, 5, 1, 2, 3);
        Stream<Integer> stream2 = Stream.of(1, 2, 3, 4, 5, 1, 2, 3);
        Stream<Integer> stream3 = Stream.of(1, 2, 3, 4, 5, 1, 2, 3);


        stream1.map(el -> {
                    System.out.println("умножение " + el);
                    return el * 2;
                }).filter(el -> {
                    System.out.println("фильтрация " + el);
                    return el % 2 == 0;
                })
                .forEach(System.out::println)
        ;


    }
}

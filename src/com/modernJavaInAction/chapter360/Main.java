package com.modernJavaInAction.chapter360;

import com.modernJavaInAction.chapter211.Apple;
import com.modernJavaInAction.chapter211.Color;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Apple a1 = new Apple(Color.RED, 151);
        Apple a2 = new Apple(Color.GREEN, 151);
        Apple a3 = new Apple(Color.RED, 223);
        Apple a4 = new Apple(Color.GREEN, 80);

        List<Apple> inventory = new ArrayList<>(List.of(a1, a2, a3, a4));

        inventory.sort(Comparator.comparing(Apple::getWeight));
        System.out.println(inventory);
        inventory.sort(Comparator.comparing(Apple::getWeight).thenComparing(Apple::getColor));
        System.out.println(inventory);


        inventory.sort(Comparator.comparing(Apple::getWeight).reversed());
        System.out.println(inventory);

        List<String> str = Arrays.asList("a","b","A","B");
        str.sort((s1, s2) -> s1.compareToIgnoreCase(s2));

        List<String> str2 = Arrays.asList("a","b","A","B");
        str2.sort(String::compareToIgnoreCase);

        Function<Integer, Apple> f = Apple::new;

        Apple apple = f.apply(300);

        BiFunction<Color, Integer, Apple> colorIntegerAppleBiFunction = Apple::new;

        Apple apply = colorIntegerAppleBiFunction.apply(Color.GREEN, 129);


    }
}

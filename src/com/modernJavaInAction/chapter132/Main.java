package com.modernJavaInAction.chapter132;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Apple a1 = new Apple(Color.RED, 100);
        Apple a2 = new Apple(Color.GREEN, 151);
        Apple a3 = new Apple(Color.RED, 223);
        Apple a4 = new Apple(Color.GREEN, 80);

        List<Apple> inventory = List.of(a1, a2, a3, a4);

        List<Apple> greenApples = inventory.parallelStream().filter(apple -> Color.GREEN.equals(apple.getColor())).collect(Collectors.toList());
        List<Apple> heavyApples = inventory.parallelStream().filter(apple -> apple.getWeight() > 150).collect(Collectors.toList());

        List<Apple> result1 = filterGreenApples(inventory);
        List<Apple> result2 = filterGreenApplesStream(inventory);
        List<Apple> result3 = filterApples(inventory, Apple::isGreenApple);
        List<Apple> result4 = filterApples(inventory, (Apple a) -> Color.GREEN.equals(a.getColor()));

//        System.out.println(result1);
//        System.out.println(result2);
//        System.out.println(result3);
//        System.out.println(result4);
        System.out.println(greenApples);
        System.out.println(heavyApples);

    }

    public static List<Apple> filterGreenApples(List<Apple> inventory) {
        List<Apple> result = new ArrayList<>();

        for (var apple: inventory
             ) {
            if (Color.GREEN.equals(apple.getColor())) {
                result.add(apple);
            }
        }

        return result;
    }

    public static List<Apple> filterGreenApplesStream(List<Apple> inventory) {
        return inventory.stream().filter(apple -> Color.GREEN.equals(apple.getColor())).collect(Collectors.toList());
    }

    public interface Predicate<T> {
        boolean test(T t);
    }

    static List<Apple> filterApples(List<Apple> inventory, Predicate<Apple> predicate) {
        return inventory.stream().filter(predicate::test).collect(Collectors.toList());
    }



}

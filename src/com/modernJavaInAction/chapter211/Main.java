package com.modernJavaInAction.chapter211;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Apple a1 = new Apple(Color.RED, 100);
        Apple a2 = new Apple(Color.GREEN, 151);
        Apple a3 = new Apple(Color.RED, 223);
        Apple a4 = new Apple(Color.GREEN, 80);

        List<Apple> inventory = new ArrayList<>(List.of(a1, a2, a3, a4));

        List<Apple> greenApples = filterApples(inventory, apple -> Color.GREEN.equals(apple.getColor()));
        List<Apple> greenAndHeavyApples = filterApples(inventory, apple -> Color.GREEN.equals(apple.getColor()) && apple.getWeight() > 100);

        System.out.println(greenApples);
        System.out.println(greenAndHeavyApples);


        System.out.println("\nPRINT ALL COLORS");

        prettyPrintApple(inventory, (apple) -> {
            System.out.println(apple.getColor());
        });

        System.out.println("\nPRINT ALL COLORS AND WEIGHTS");

        prettyPrintApple(inventory, apple -> {
            System.out.println(apple.getWeight() + ":" + apple.getColor());
        });

        System.out.println("\nPRINT SORT BY WEIGHT");

        inventory.sort((apple1, apple2) -> apple1.getWeight().compareTo(apple2.getWeight()));

        System.out.println(inventory);

    }

    public static List<Apple> filterApples(List<Apple> inventory, Predicate<Apple> predicate) {
        return inventory.stream().filter(predicate).collect(Collectors.toList());
    }

    public static void prettyPrintApple(List<Apple> inventory, Consumer<Apple> consumer) {
        inventory.forEach(consumer);
    }
}

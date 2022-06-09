package com.modernJavaInAction.chapter400;

import java.util.List;
import java.util.stream.Collectors;

public class ViewProcess {
    public static void main(String[] args) {
        List<Dish> menu =
                MenuSimpleFabric.getMenu();

        List<String> names = menu.stream()
                .filter(d -> {
                    System.out.println("filter: " + d.getName());
                    return d.getCalories() > 300;
                })
                .map(d -> {
                    System.out.println("map: " + d.getName());
                    return d.getName();
                })
                .limit(3)
                .collect(Collectors.toList());

        System.out.println(names);
    }
}

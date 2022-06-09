package com.modernJavaInAction.chapter620;

import com.modernJavaInAction.chapter400.Dish;
import com.modernJavaInAction.chapter400.MenuSimpleFabric;

import static java.util.stream.Collectors.*;

import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Dish> menu = MenuSimpleFabric.getMenu();

        Long menuCount = menu.stream().collect(counting());

        System.out.println("menuCount: " + menuCount);


        Comparator<Dish> dishComparator = Comparator.comparingInt(Dish::getCalories);

        Optional<Dish> mostCalorieDish = menu.stream().collect(maxBy(dishComparator));
        System.out.println("mostCalorieDish: " + mostCalorieDish.get());


        int totalCalories = menu.stream().collect(summingInt(Dish::getCalories));
        System.out.println("totalCalories: " + totalCalories);

        double avgCalories =
                menu.stream().collect(averagingInt(Dish::getCalories));
        System.out.println("avgCalories: " + avgCalories);


        IntSummaryStatistics menuStatistics = menu.stream().collect(summarizingInt(Dish::getCalories));
        System.out.println("menuStatistics: " + menuStatistics);


        String shortMenu = menu.stream().map(Dish::getName).collect(joining(", "));
        System.out.println("shortMenu: " + shortMenu);

    }
}

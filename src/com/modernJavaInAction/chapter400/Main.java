package com.modernJavaInAction.chapter400;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Dish> menu = MenuSimpleFabric.getMenu();

        List<String> lowCaloriesDishesName = menu.parallelStream()
                .filter(d -> d.getCalories() < 400)
                .map(Dish::getName)
                .collect(Collectors.toList());
        System.out.println(lowCaloriesDishesName);

        List<String> highCaloriesDishesName = menu.parallelStream()
                .filter(d -> d.getCalories() > 300)
                .map(Dish::getName)
                .limit(3)
                .collect(Collectors.toList());

        System.out.println(highCaloriesDishesName);


    }


//    public void pass() {
//        if (ball.isPresent() && controlTime > 15) {
//            ball.giveToTeammate();
//        }
//    }
}

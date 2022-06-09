package com.modernJavaInAction.chapter521;

import com.modernJavaInAction.chapter400.Dish;
import com.modernJavaInAction.chapter400.MenuSimpleFabric;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Dish> specialMenu = MenuSimpleFabric.getSpecialMenu();
        System.out.println(specialMenu);

        List<Dish> slicedMenu1 = specialMenu.stream().takeWhile(dish -> dish.getCalories() < 320).collect(Collectors.toList());
        System.out.println("< 320:" + slicedMenu1);
        List<Dish> slicedMenu2 = specialMenu.stream().dropWhile(dish -> dish.getCalories() < 320).collect(Collectors.toList());
        System.out.println("> 320:" + slicedMenu2);


        List<Dish> menu = MenuSimpleFabric.getMenu();

        List<Dish> notVeganMenu = menu.stream()
                .filter(dish -> !dish.isVegetarian())
                .limit(2)
                .collect(Collectors.toList());
        System.out.println("not Vegan Menu: " + notVeganMenu);
    }
}

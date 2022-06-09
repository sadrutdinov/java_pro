package com.modernJavaInAction.chapter400;

import java.util.Arrays;
import java.util.List;

public class MenuSimpleFabric {
    public static List<Dish> getMenu() {
        List<Dish> menu = Arrays.asList(
                new Dish("свинина", false, 800, Dish.Type.MEAT),
                new Dish("говядина", false, 700, Dish.Type.MEAT),
                new Dish("курица", false, 400, Dish.Type.MEAT),
                new Dish("картофель фри", true, 530, Dish.Type.OTHER),
                new Dish("рис", true, 350, Dish.Type.OTHER),
                new Dish("сезонные фрукты", true, 120, Dish.Type.OTHER),
                new Dish("пицца", true, 550, Dish.Type.OTHER),
                new Dish("креветки", false, 300, Dish.Type.FISH),
                new Dish("лосось", false, 450, Dish.Type.FISH) );

        return menu;
    }

    public static List<Dish> getSpecialMenu() {
        List<Dish> specialMenu = Arrays.asList(
                new Dish("seasonal fruit", true, 120, Dish.Type.OTHER),
                new Dish("prawns", false, 300, Dish.Type.FISH),
                new Dish("rice", true, 350, Dish.Type.OTHER),
                new Dish("chicken", false, 400, Dish.Type.MEAT),
                new Dish("french fries", true, 530, Dish.Type.OTHER));

        return specialMenu;
    }
}

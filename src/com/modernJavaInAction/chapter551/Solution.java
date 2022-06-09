package com.modernJavaInAction.chapter551;

import com.modernJavaInAction.chapter400.Dish;
import com.modernJavaInAction.chapter400.MenuSimpleFabric;

import java.util.List;

public class Solution {
    public static void main(String[] args) {
        List<Dish> menu = MenuSimpleFabric.getMenu();

        Integer dishCount = menu.stream()
                .map(dish -> 1)
                .reduce(0, Integer::sum);

        System.out.println(menu.size());
        System.out.println(dishCount);
    }
}

package com.modernJavaInAction.chapter381;

import com.modernJavaInAction.chapter211.Color;
import com.solid.isp.isp_violation.A;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Apple a1 = new Apple("RUS", 150, Color.GREEN);
        Apple a2 = new Apple("ENG", 150, Color.RED);
        Apple a3 = new Apple("RUS", 129, Color.GREEN);
        Apple a4 = new Apple("ENG", 203, Color.RED);
        Apple a5 = new Apple("RUS", 95, Color.GREEN);

        List<Apple> apples = new ArrayList<>(List.of(a1, a2, a3, a4, a5));

        apples.sort(Comparator.comparing(Apple::getWeight));
        System.out.println(apples);

        apples.sort(Comparator.comparing(Apple::getWeight).thenComparing(Apple::getCountry));
        System.out.println(apples);


    }
}

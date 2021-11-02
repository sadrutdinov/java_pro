package com.sai.lambda;

import java.util.ArrayList;
import java.util.function.Predicate;

public class RemoveIf {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("privet");
        arrayList.add("poka");
        arrayList.add("ok");
        arrayList.add("uchim java");
        arrayList.add("a imenno lambdas");

//        Predicate<String> predicate = element-> element.length() < 5;
//        arrayList.removeIf(predicate);

        arrayList.removeIf(element-> element.length() < 5);

        System.out.println(arrayList);
    }
}

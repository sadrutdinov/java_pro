package com.modernJavaInAction.chapter532;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution2 {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(3, 4);

        List<List<Integer>> collect = list1.stream()
                .flatMap(i -> list2.stream().map(j -> Arrays.asList(i, j)))
                .collect(Collectors.toList());


        System.out.println(collect);
        List<List<Integer>> collect3 = list1.stream()
                .flatMap(i -> list2.stream().map(j -> Arrays.asList(i, j)))
                .filter(list -> (list.get(0) + list.get(1)) % 3 == 0)
                .collect(Collectors.toList());


        System.out.println(collect3);


    }
}

package com.modernJavaInAction.chapter532;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        List<Integer> collect = list.stream()
                .map(x -> x * x)
                .collect(Collectors.toList());

        System.out.println(collect);


    }
}

package com.modernJavaInAction.chapter551;

import com.solid.isp.isp_violation.I;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,23,46,87,0,6,3);

        Optional<Integer> reduce = list.stream().reduce(Integer::max);

        System.out.println(reduce.get());
    }
}

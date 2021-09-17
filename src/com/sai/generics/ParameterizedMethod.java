package com.sai.generics;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ParameterizedMethod {
    public static void main(String[] args) {
        ArrayList<Integer> al1 = new ArrayList<>();
        al1.add(10);
        al1.add(10);
        al1.add(10);

        int a = GenMethod.getSecondElement(al1);
        System.out.println(a);

        ArrayList<String> al2 = new ArrayList<>();
        al2.add("abc");
        al2.add("abc");
        al2.add("abc");

        String s = GenMethod.getSecondElement(al2);
        System.out.println(s);


    }
}

class GenMethod {
    public static <T> T getSecondElement(ArrayList<T> al) {
        return al.get(1);
    }
}
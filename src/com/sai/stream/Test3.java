package com.sai.stream;

import java.util.Arrays;

public class Test3 {
    public static void main(String[] args) {
        int[] array = {5, 9, 3, 8, 1};

//        Arrays.stream(array).forEach(element -> {
//            element = element * 2;
//            System.out.println(element);
//        });

        Arrays.stream(array).forEach(Utils::myMethod);

    }


}

class Utils {
    public static void myMethod(int a) {
        a +=5;
        System.out.println("Element = " + a);
    }
}

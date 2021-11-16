package com.sai.stream;

import java.util.Arrays;

public class Test5 {
    public static void main(String[] args) {
        int[] array = {3, 8, 1, 5, 9, 12, 4, 21, 81, 7, 18};

//        array = Arrays.stream(array).sorted().toArray();
//        System.out.println(Arrays.toString(array));
        int result = Arrays.stream(array).filter(e -> e % 2 == 1)
                .map(e -> e * 2).reduce((a, e) -> a + e).getAsInt();

        System.out.println(result);
    }
}

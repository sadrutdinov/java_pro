package com.algorithmsAndDataStructures;

public class RecursionExample {
    public static void main(String[] args) {
        System.out.println(arraySum(new int[] {2, 4, 6, 12, 10}));
    }

    public static int factorial(int x) {
        System.out.println(x);
        if (x == 1) {
            return x;
        }

        return x * factorial(x - 1);
    }


    public static int arraySum(int[] array) {
        if (array.length == 0) {
            return 0;
        }

        int[] newArray = new int[array.length - 1];
        System.arraycopy(array, 1, newArray, 0, array.length - 1);
        return array[0] + arraySum(newArray);
    }
}

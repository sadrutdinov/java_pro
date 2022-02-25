package com.algorithmsAndDataStructures;

public class Fibbonacci {
    public static void main(String[] args) {


        // 0 1 1 2 3
        System.out.println(fibNaive(3));
        System.out.println(fibNaive(5));
        System.out.println(fibNaive(10));

        System.out.println(fibMain(10));
        System.out.println(fibMain(100));
        System.out.println(fibEffective(100));




    }

    // наивный медленный очевидный
    private static long fibNaive(int n) {
        if (n <= 1) return n;

        return fibNaive(n - 1) + fibNaive(n - 2);
    }

    private static long fibMain(int n) {
        if (n <= 1) return n;

        long firstValue = 1;
        long secondValue = 1;
        long temp;

        for (int i = 0; i < n - 2; i++) {
            temp = firstValue;
            firstValue = firstValue + secondValue;
            secondValue = temp;
        }

        return firstValue;
    }

    private static long fibEffective(int n) {
        long arr[] = new long[n + 1];

        arr[0] = 0;
        arr[1] = 1;

        for (int i = 2; i <= n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }

        return arr[n];
    }
}

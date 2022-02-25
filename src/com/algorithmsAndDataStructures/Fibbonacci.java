package com.algorithmsAndDataStructures;

import java.util.Arrays;

public class Fibbonacci {
    public static void main(String[] args) {

        int n = 100;

        long[] mem = new long[n+1];

        Arrays.fill(mem, -1);

        System.out.println(fibNaive(n, mem));





    }

    // наивный медленный очевидный
    // O(2^n) - первая версия
    private static long fibNaive(int n, long[] mem) {

        if (mem[n] != -1) {
            return mem[n];
        }

        if (n <= 1) return n;

        long result =  fibNaive(n - 1, mem) + fibNaive(n - 2, mem );
        mem[n] = result;

        return result;
    }
    // O(n)
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


    // O (n)
    private static long fibEffective(int n) {

        // O(n)
        long arr[] = new long[n + 1];

        arr[0] = 0; // O(1)
        arr[1] = 1; // O(1)

        // n = 2 => итераций цикла 1
        // n = 3 => итераций цикла 2
        // n = 4 => итераций цикла 3

        // O (n+n) => O(2n) => O(n)

        for (int i = 2; i <= n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }


        return arr[n]; // O(1)
    }
}

// O(n) + O(1) + O(1) + O(n) + O(1) = O(2n) + O(3) = O(2n+3) = O(n)
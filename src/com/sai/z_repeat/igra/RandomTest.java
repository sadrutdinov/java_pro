package com.sai.z_repeat.igra;

import java.util.Random;

public class RandomTest {
    public static void main(String[] args) {
        int i0 = 0;
        int i1 = 0;

        Random random = new Random();
        for (int i = 0; i < 1000000000; i++) {
            int result = random.nextInt(2);
            if (result == 0) {
                i0++;
            }
            else {
                i1++;
            }
        }

        System.out.println("end");
        System.out.println("0: " + i0);
        System.out.println("1: " + i1);
    }
}

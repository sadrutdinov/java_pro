package com.algorithmsAndDataStructures;

import java.util.Arrays;

public class MaximumNumber {
    public static void main(String[] args) {
//        int[] array = new int[] {1, 3, 3, 2, 7, 9, 6};
//        long maxNumber = getMaxNumber(array);
//        System.out.println(maxNumber);

        int[] stations = {0, 200, 375, 550, 750, 950};
//        int[] stations = {0, 1000, 2000};

        System.out.println(minStops(stations, 400));
    }


    public static long getMaxNumber(int[] array) {
        Arrays.sort(array);
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = array.length - 1; i >= 0; i--) {
            stringBuilder.append(array[i]);
        }
        return Long.parseLong(String.valueOf(stringBuilder));
    }


    // -1 if it's impossible to get a from b
    public static int minStops(int[] stations, int capacity) {
        int result = 0; // оптимальное количество остановок
        int currentStop = 0;

        while (currentStop < stations.length - 1) {
            int nextStop = currentStop;

            while (nextStop < stations.length - 1 &&
                    stations[nextStop + 1] - stations[currentStop] <= capacity) {
                nextStop++;
            }

            if (currentStop == nextStop) {
                return -1;
            }

            if (nextStop < stations.length - 1) {
                result++;
            }

            currentStop = nextStop;
        }


        return result;
    }


}

package com.algorithmsAndDataStructures;

import java.util.Arrays;

public class SelectionSortExample {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, -11, 5, 6, 7, 8, 9, 10};

        int[] ints = selectionSort(array);
        System.out.println(Arrays.toString(ints));

    }

    private static int[] selectionSort(int[] array) {

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < array.length - 1; i++) {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min_idx])
                    min_idx = j;
            }

            // Swap the found minimum element with the first element
            int temp = array[min_idx];
            array[min_idx] = array[i];
            array[i] = temp;
        }

        return array;
    }
}

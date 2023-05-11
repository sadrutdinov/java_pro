package com.algorithmsAndDataStructures;

public class BinarySearch {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int item = 8;

        System.out.println(binarySearch(array, item));


    }

    // режем каждый раз пополам, логарифмическая сложность
    // массив должен быть отсортирован
    public static Integer binarySearch(int[] array, int searchValue) {
        int lowIndex = 0;
        int highIndex = array.length - 1;
        int midIndex;
        int midValue;

        while (lowIndex <= highIndex) {
            midIndex = (lowIndex + highIndex) / 2;
            midValue = array[midIndex];

            if (midValue == searchValue) {
                return midIndex;
            }
            if (midValue > searchValue) {
                highIndex = midIndex - 1;
            } else {
                lowIndex = midIndex + 1;
            }
        }

        return null;
    }
}

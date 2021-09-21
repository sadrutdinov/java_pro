package com.sai.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchExample {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < 100000; i++) {
            arrayList.add(i);
        }

        arrayList.add(80209, 80210);

        Collections.shuffle(arrayList);

        long start = System.currentTimeMillis();

        long loopCount = 100000;

        Collections.sort(arrayList);

        for (int i = 0; i < loopCount; i++) {
            System.out.println(binarySearch(arrayList, 80210));
        }

        long end = System.currentTimeMillis();


        System.out.println("result: " + (double)(end - start)/loopCount + " ms");
    }

    public static Integer search(List list, Integer element) { // result: 0.11932 ms
        int index;
        index = list.indexOf(element);
        return index;
    }


    public static Integer binarySearch(List list, Integer element) { // result: 0.01094 ms

        int index;
        index = Collections.binarySearch(list, element);
        return index;
    }
}

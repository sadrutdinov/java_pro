package com.sai.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Zaur");
        arrayList.add("Ivan");
        arrayList.add("Maria");


        ArrayList<String> arrayList2 = new ArrayList<>(200);
        arrayList2.add("Zaur");
        arrayList2.add("Ivan");

        List<String> arrayList3 = new ArrayList<>();


        ArrayList<String> arrayList4 = new ArrayList<>(arrayList);

        System.out.println(arrayList);
        System.out.println(arrayList4);

        //false
        System.out.println(arrayList == arrayList4);


    }
}

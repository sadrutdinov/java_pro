package com.sai.collections;

import java.util.ArrayList;

public class ArrayListMethods1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Zaur");
        arrayList1.add("Ivan");
        arrayList1.add("Maria");
        arrayList1.add(1, "Misha");

        System.out.println(arrayList1);

//        for (String s: arrayList1) {
//            System.out.print(s + " ");
//        }


        System.out.println();
//        System.out.println(arrayList1.size());


//        System.out.println(arrayList1.get(1));


        arrayList1.remove(0);

        System.out.println(arrayList1);
    }
}

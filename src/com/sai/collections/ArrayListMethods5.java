package com.sai.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethods5 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Zaur");
        arrayList1.add("Ivan");
        arrayList1.add("Mariya");
        arrayList1.add("Kolya");
        arrayList1.add("Elena");


        List<String> list2 = List.copyOf(arrayList1);
        list2.add("aydar"); // UnsupportedOperationException  {


        System.out.println(list2);
//
//
////        System.out.println(arrayList1);
//
//        Object[] array = arrayList1.toArray();
//        String[] array2 = arrayList1.toArray(new String[0]);
//
//        for (String s: array2
//             ) {
//            System.out.println(s);
//        }

//        List<Integer> integers = List.of(3, 8, 13);
//        integers.add(111); // unsupported operations
//
//        System.out.println(integers);

//
////        ArrayList<String> arrayList2 = new ArrayList<>();
////        arrayList2.add("Zaur");
////        arrayList2.add("Mariya");
//////        arrayList2.add("Igor");
////
//////        arrayList1.retainAll(arrayList2);
//////        System.out.println(arrayList1);
////
////
////        System.out.println(arrayList1.containsAll(arrayList2));
//
//        List<String> sublist = arrayList1.subList(0, 2);
//        System.out.println(sublist);
//
//        sublist.add("Aydar");
//        System.out.println(sublist);
//        System.out.println(arrayList1);
    }
}

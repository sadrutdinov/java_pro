package com.sai.z_repeat;

import java.util.ArrayList;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {


        List<?> list = new ArrayList<String>();
        List<? extends Number> listEx = new ArrayList<Integer>();
        List<? super Number> listSuper = new ArrayList<Object>();

        List<Double> list1 = new ArrayList<>();
        list1.add(3.12);
        list1.add(3.11);
        list1.add(3.16);

        showListInfo(list1);


        List<String> list2 = new ArrayList<>();
        list2.add("1");
        list2.add("3.11");
        list2.add("3.16");

        showListInfo(list2);

        List<? extends Number> list3 = new ArrayList<Integer>();

        ArrayList<Double> list4 = new ArrayList<>();
        list4.add(2113.0);
        list4.add(23213.12);
        list4.add(2123.12);
        list4.add(213213.12);
        list4.add(23.);

        System.out.println(sum(list4));


        ArrayList<Integer> list5 = new ArrayList<>();
        list5.add(12321);
        list5.add(12321);
        list5.add(12321);
        list5.add(1221);
        list5.add(12);

        System.out.println(sum(list5));

    }

    static void showListInfo(List<?> list) {
        System.out.println("list contains next elements: " + list);

    }

    public static double sum(ArrayList<? extends Number> list) {
        double sum = 0;

        for (Number n: list
             ) {
            sum+= n.doubleValue();
        }

        return sum;

    }
}



package com.sai.generics;

import java.util.ArrayList;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {

        List<?> list = new ArrayList<String>();
//        list.add("hello");



        List<Double> list1 = new ArrayList<>();
        list1.add(3.14);
        list1.add(3.15);
        list1.add(3.16);

        showListInfo(list1);



        ArrayList<String> list2 = new ArrayList<>();
        list2.add("ad");
        list2.add("sad");
        list2.add("root");

        showListInfo(list2);

        ArrayList<Double> doubleArrayList = new ArrayList<>();
        doubleArrayList.add(22131.312);
        doubleArrayList.add(3422131.312);
        doubleArrayList.add(31.312);
        doubleArrayList.add(242131.312);


        System.out.println(sum(doubleArrayList));


        ArrayList<Integer> intArrayList = new ArrayList<>();
        intArrayList.add(231);
        intArrayList.add(3422131);
        intArrayList.add(31);
        intArrayList.add(242131);


        System.out.println(sum(intArrayList));

        List<? extends Number> list30 = new ArrayList<Integer>();
        List<? super Number> list31 = new ArrayList<Object>();


    }

    static void showListInfo(List<?> list) {
        System.out.println("list elements: \n" + list);

    }

    public static double sum(ArrayList<? extends Number> al) {
        double sum = 0;


        for (Number number: al) {
            sum += number.doubleValue();
        }


        return sum;

    }
}

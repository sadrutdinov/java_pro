package com.sai.z_repeat;

import java.util.ArrayList;
import java.util.List;

public class ParametrizedMethod {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // ArrayList list = new ArrayList();
        Integer i0 = list.get(0);
        // Integer i0 = (Integer) list.get(0);

        list.add(2);
        list.add(9);


        Integer i = GenMethod.getSecondElement(list);
        System.out.println(i);


        ArrayList<String> listStr = new ArrayList<>();
        listStr.add("gdwedv");
        listStr.add("gdwedv");

//        String s = GenMethod.getSecondElement(listStr);
//        System.out.println(s);

    }


}

class GenMethod {
    public static <T extends Number> T getSecondElement(ArrayList<T> list) {
        return list.get(1);
    }

}

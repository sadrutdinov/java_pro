package com.sai.generics;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("xsca");
        list.add("xscadfcd");
        list.add("xscadas");
        list.add("xscadas");

        for (Object o: list) {
            System.out.println(o + "dlina: " + ((String)o).length());
        }
    }
}

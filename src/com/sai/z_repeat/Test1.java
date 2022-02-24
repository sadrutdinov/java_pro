package com.sai.z_repeat;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
//
//        list.add(new Car());
//        list.add("OK");
//        list.add("1");
//        list.add(99);

        // дженерики нужны для type safe и reusable code


        list.add("privet");
        list.add("poka");
        list.add("og");
        list.add("dqwfewgr");
//        list.add(1);


        for (String s: list) {
//            System.out.println(((String)s).length() );
            System.out.println(s.length());
        }

    }
}

class Car {

}

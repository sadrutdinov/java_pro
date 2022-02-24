package com.sai.z_repeat;

import javax.print.attribute.standard.MediaSize;

public class ParametrizedClass2 {
    public static void main(String[] args) {
        Pair<String, Integer> pair1 = new Pair<>("hello", 12);

        String value1 = pair1.getValue1();
        Integer value2 = pair1.getValue2();

        System.out.println("pair1");
        System.out.println("value1 = " + value1 + ", type = " + value1.getClass().getName());
        System.out.println("value2 = " + value2 + ", type = " + value2.getClass().getName());


        Pair<Integer, Double> pair2 = new Pair<>(111, 122213.231);

        System.out.println("pair2");
        System.out.println("value1 = " + pair2.getValue1() + ", type = " + pair2.getValue1().getClass().getName());
        System.out.println("value2 = " + pair2.getValue2() + ", type = " + pair2.getValue2().getClass().getName());


        OtherPair<String> stringOtherPair = new OtherPair<>("123", "11324");

    }

}

class Pair<V1, V2> {
    private V1 value1;
    private V2 value2;

    public Pair(V1 value1, V2 value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public V1 getValue1() {
        return value1;
    }

    public V2 getValue2() {
        return value2;
    }
}

class OtherPair<V> {
    private V value1;
    private V value2;

    public OtherPair(V value1, V value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public V getValue1() {
        return value1;
    }

    public V getValue2() {
        return value2;
    }
}


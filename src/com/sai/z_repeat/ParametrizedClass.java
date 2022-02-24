package com.sai.z_repeat;

public class ParametrizedClass {
    public static void main(String[] args) {
//        Info<String> info1 = new Info<>("privet");
//        System.out.println(info1);
//        String s1 = info1.getValue();


        Info<Integer> info2 = new Info<>(22);
        System.out.println(info2);
        Integer i1 = info2.getValue();

        System.out.println(Info.counter);

//        Info<Bus> info3 = new Info<>(new Bus());
//        Bus b1 = info3.getValue();
//        System.out.println(b1);

        Info<Double> info3 = new Info<>(3.15);
        System.out.println(info2);
        Double i112 = info3.getValue();

    }


//    public void abc(Info<String> info) {
//        String s = info.getValue();
//    }
//
//
//    public void abc(Info<Integer> info) {
//        Integer i  = info.getValue();
//    }

}

class Info<T extends Number> {
    private T value;  // T -> type placeholder
    public static int counter;

    public Info(T value) {
        this.value = value;
        counter++;
    }

    public T getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "{[=" + value + "=]}";
    }
}

interface  I1 {

}

interface  I2 {

}

//class Parent {
//    public void abc(Info<String> info) {
//        String s = info.getValue();
//    }
//}
//
//class Child extends Parent {
////    public void abc(Info<Integer> info) {
////        Integer s = info.getValue();
////    }
//}

class Bus {

}
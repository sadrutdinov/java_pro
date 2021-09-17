package com.sai.generics;

public class ParameterizedClass {
    public static void main(String[] args) {
//        Info<String> info1 = new Info<>("hello");
//        System.out.println(info1);
//        String s = info1.getValue();
//
//        Info<Integer> info2 = new Info<>(16);
//        System.out.println(info2);
//        Integer i = info2.getValue();


    }
//ERROR
//    public void abc(Info<String> info) {
//        String s = info.getValue();
//    }
//
//    public void abc(Info<Integer> info) {
//        Integer s = info.getValue();
//    }
}

class Info<T> {


    private T value;
    public Info(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "{[" + value + "]}";
    }

    public T getValue() {
        return value;
    }


}

class Parent{
    public void abc(Info<String> info) {
        String s = info.getValue();
    }
}
//ПРИ ИПСОЛЬЗОВАНИИ ДЖЕНЕРИКОВ ДЛЯ ДЖАВА МАШИНЫ ПРОИСХОДИТ СТИРАНИЕ ТИПОВ
//  public void abc(Info<Integer> info) -> public void abc(Info info)

//class Child extends Parent{
//    public void abc(Info<Integer> info) {
//        String s = info.getValue();
//    }
//}

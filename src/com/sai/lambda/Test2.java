package com.sai.lambda;

public class Test2 {
    static void def(I i) {
        System.out.println(i.abc("hello"));
    }

    public static void main(String[] args) {


        I test = s -> s.length();

        def(test);

    }
}

interface I {
    int abc(String s);
}


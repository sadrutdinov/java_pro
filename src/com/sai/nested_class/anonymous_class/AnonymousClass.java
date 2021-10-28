package com.sai.nested_class.anonymous_class;

public class AnonymousClass {
    private int x = 5;
    public static void main(String[] args) {

        Math math = new Math() {


            @Override
            public int doOperation(int a, int b) {
                AnonymousClass ac = new AnonymousClass();
                return a + b + ac.x;
            }
        };

        System.out.println(math.doOperation(3, 6));

        Math math2 = new Math() {
            @Override
            public int doOperation(int a, int b) {
                return a * b;
            }
        };

        System.out.println(math2.doOperation(3, 6));
    }

}

interface Math {
    int doOperation(int a, int b);
}
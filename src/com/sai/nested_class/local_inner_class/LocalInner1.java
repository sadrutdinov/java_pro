package com.sai.nested_class.local_inner_class;

public class LocalInner1 {

    public static void main(String[] args) {
        Math math = new Math();
        math.getResult(10,4);
    }
}


class Math {

    public void getResult(int delimoe, int delitel) {

        class Deleniye {


            public int getChastnoe() {
                return delimoe/delitel;
            }

            public int getOstatok() {
                return delimoe%delitel;
            }

        }

        Deleniye deleniye = new Deleniye();


        System.out.println(deleniye.getChastnoe());
        System.out.println(deleniye.getOstatok());
    }

}
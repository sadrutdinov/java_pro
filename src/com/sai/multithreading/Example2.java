package com.sai.multithreading;

public class Example2 {
    public static void main(String[] args) {
        MyThread1 myThread1 = new MyThread1();
        MyThread2 myThread2 = new MyThread2();

        myThread1.start();
        myThread2.start();
    }

}

class MyThread1 extends Thread {

    @Override
    public void run() {
        for (int i = 1; i < 1000; i++) {
            System.out.println("MyThread1 " + i);
        }
    }
}

class MyThread2 extends Thread {

    @Override
    public void run() {
        for (int i = 1000; i > 0; i--) {
            System.out.println("MyThread2 " + i);
        }
    }
}
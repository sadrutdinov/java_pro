package com.sai.multithreading;

public class SynchronizedBlock {
    public static void main(String[] args) {
        MyRunnableImpl2 runnable = new MyRunnableImpl2();
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        Thread thread3 = new Thread(runnable);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class Counter2 {
    static int counter = 0;
}

class MyRunnableImpl2 implements Runnable {

    private void doWork2() {
        System.out.println("Ура");
    }

    private void doWork1() {
        doWork2();
        synchronized (this) {
            Counter.counter++;
            System.out.println(Counter.counter);
        }

    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            doWork1();
        }
    }
}

package com.sai.multithreading;

public class Ex8 extends Thread {
    @Override
    public void run() {
        for (int i = 1; i < 10; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }

    public static void main(String[] args) throws InterruptedException {

        Thread thread1 = new Thread(new MyRunnable1());
        thread1.start();


        Ex8 thread2 = new Ex8();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("Конец");
    }
}


class MyRunnable1 implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i < 10; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}
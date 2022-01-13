package com.sai.multithreading;

public class Ex6 implements Runnable {
    public static void main(String[] args) {

        Thread thread = new Thread(new Ex6());
        thread.start();

        System.out.println("Method main. Thread Name = " + Thread.currentThread().getName());
    }

    @Override
    public void run() {
        System.out.println("Method run. Thread Name = " + Thread.currentThread().getName());
    }
}



package com.sai.multithreading;

public class Ex5 {
    public static void main(String[] args) {
        MyThread5 myThread5 = new MyThread5();
        myThread5.setName("1");
        myThread5.setPriority(Thread.MAX_PRIORITY);
        System.out.println("name of myThread5 = " + myThread5.getName() + ", priority = " + myThread5.getPriority());

        MyThread5 myThread6 = new MyThread5();
        System.out.println("name of myThread6 = " + myThread6.getName() + ", priority = " + myThread6.getPriority());
    }
}

class MyThread5 extends Thread {
    @Override
    public void run() {
        System.out.println("privet");
    }
}
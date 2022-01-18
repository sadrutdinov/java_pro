package com.sai.multithreading;

public class DaemonExample {
    public static void main(String[] args) {
        System.out.println("Main thread starts");

        UserThread userThread = new UserThread();
        userThread.setName("UserThread");

        DaemonThread daemonThread = new DaemonThread();
        daemonThread.setName("daemonThread");
        daemonThread.setDaemon(true);

        userThread.start();
        daemonThread.start();



        System.out.println("Main thread ends");
    }
}

class UserThread extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is daemon: " + isDaemon());

        for (char i = 'A'; i <= 'J' ; i++) {
            try {
                sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }
    }
}

class DaemonThread extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is daemon: " + isDaemon());

        for (int i = 1; i <= 1000 ; i++) {
            try {
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }
    }
}
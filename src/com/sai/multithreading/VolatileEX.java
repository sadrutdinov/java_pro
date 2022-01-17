package com.sai.multithreading;

public class VolatileEX extends Thread{

    // переменная хранится в основной памяти
    // юзается только тогда, когда один поток может изменять эту переменную, а все остальные читают
    volatile boolean b = true;

    public static void main(String[] args) throws InterruptedException {
        VolatileEX thread = new VolatileEX();
        thread.start();
        Thread.sleep(3000);
        System.out.println("After 3 seconds it is time to wake up");

        thread.b = false;

        thread.join();

        System.out.println("End of program");
    }

    @Override
    public void run() {
        long counter = 0;

        while (b) {
            counter++;

        }

        System.out.println("loop is finished, counter = " + counter);
    }
}

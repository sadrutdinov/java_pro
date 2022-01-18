package com.sai.multithreading;

public class InterruptionExample {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main starts");

        InterruptedThread thread = new InterruptedThread();
        thread.start();

        Thread.sleep(2000);

        thread.interrupt();

        thread.join();

        System.out.println("Main ends");
    }
}


class InterruptedThread extends Thread {
    private double sqrtSum = 0;

    @Override
    public void run() {
        for (int i = 0; i < 1000000000; i++) {
            if (isInterrupted()) {
                System.out.println("Поток хотят прервать");
                System.out.println("Состояние объектов нормальное, спокойно прерываем поток");
                System.out.println(sqrtSum);
                return;
            }
            try {
                sleep(100);
            } catch (InterruptedException e) {
//                e.printStackTrace();
                System.out.println("Поток хотят прервать во время сна, давайте завершим его работу");
                System.out.println(sqrtSum);
                return;
            }
            sqrtSum += Math.sqrt(i);
        }

        System.out.println(sqrtSum);
    }
}
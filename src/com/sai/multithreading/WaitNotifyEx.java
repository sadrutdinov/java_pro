package com.sai.multithreading;

public class WaitNotifyEx {
    public static void main(String[] args) {
        Market market = new Market();

        Producer producer = new Producer(market);
        Consumer consumer = new Consumer(market);

        Thread thread1 = new Thread(producer);
        Thread thread2 = new Thread(consumer);

        thread1.start();
        thread2.start();
    }
}

class Market {
    int breadCount = 0;

    synchronized void getBread() {
        while (breadCount < 1) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        breadCount--;
        System.out.println("Покупатель купил 1 хлеб");
        System.out.println("Количество хлеба в магазине = " + breadCount);
        notify();
    }


    synchronized void putBread() {
        while (breadCount >= 5) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        breadCount++;
        System.out.println("Поставщик привез 1 хлеб");
        System.out.println("Количество хлеба в магазине = " + breadCount);
        notify();
    }
}


class Producer implements Runnable {
    Market market;

    public Producer(Market market) {
        this.market = market;
    }


    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            market.putBread();
        }
    }
}

class Consumer implements Runnable {
    Market market;

    public Consumer(Market market) {
        this.market = market;
    }


    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            market.getBread();
        }
    }
}